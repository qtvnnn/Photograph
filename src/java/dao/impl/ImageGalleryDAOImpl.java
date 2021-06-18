/*
 * Copyright (C) 2021, FPT University<br>
 * J3.L.P0017<br>
 * Photographer<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-05-13    1.0        NangNN           First Version<br>
 */
package dao.impl;

import dao.IImageGalleryDAO;
import db.DBContext;
import entity.ImageGallery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * This class implements functions of the <code>IImageGalleryDAO</code> interface. <br>
 * This class contains method to query select data from the table <code>ImageGallery</code>.<br>
 * There are get all ImageGallery and paging, get number ImageGallery.
 *
 * @author nangnnhe130538
 */
public class ImageGalleryDAOImpl extends DBContext implements IImageGalleryDAO{

    /**
     * Get all <code>ImageGallery</code> options according in the database and paging
     *
     * @param id it is an <code>int</code>.
     * @param pageSize it is an <code>int</code>.
     * @param pageIndex it is an <code>int</code>.
     * @return a list <code>ImageGallery</code> object
     * @throws Exception
     */
    @Override
    public ArrayList<ImageGallery> getImageGalleryPaging(int id, int pageSize, int pageIndex) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM (\n"
                + "                SELECT ROW_NUMBER()\n"
                + "                OVER(ORDER BY id) as Number,* FROM ImageGallery WHERE gallery_id=? \n"
                + "                )as dbNumber where Number between ? and ?";
        
        ArrayList<ImageGallery> imageGalleries = new ArrayList<>();
        try {
            int from = pageSize * (pageIndex - 1) + 1;
            int to = pageSize * pageIndex;
            
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setInt(2, from);
            statement.setInt(3, to);
            rs = statement.executeQuery();
            while (rs.next()) {
                String img = getImagePath() + rs.getString("image");
                int imageGalleryId = rs.getInt("gallery_id");
                ImageGallery imageGallery = new ImageGallery(img, imageGalleryId);
                imageGalleries.add(imageGallery);
            }
            return imageGalleries;
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
    }

    /**
     * Get number of <code>ImageGallery</code> options according in the database
     *
     * @param id it is an <code>int</code>.
     * @param pageSize it is an <code>int</code>.
     * @return an <code>int</code>.
     * @throws Exception
     */
    @Override
    public int getNumberPages(int id, int pageSize) throws Exception {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String sql = "SELECT COUNT(id) as number FROM ImageGallery where gallery_id = ?";
        try {
            conn = getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            rs = statement.executeQuery();

            while (rs.next()) {
                int number = rs.getInt("number");
                if (number % pageSize == 0) {
                    return number / pageSize;
                } else {
                    return number / pageSize + 1;
                }
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeResultSet(rs);
            closePreparedStatement(statement);
            closeConnection(conn);
        }
        return -1;
    }

}
