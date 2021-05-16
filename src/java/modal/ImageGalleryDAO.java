/**
 * Copyright (C) 2021, FPT University
 * J3.L.P0017
 * Photographer
 * 
 * Record of change:
 * DATE         Version             Author          DESCRIPTION
 * 2021-05-13   1.0                 NangNN          First Version
 */
package modal;

import db.DBContext;
import entity.ImageGallery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ImageGalleryDAO {
    public ArrayList<ImageGallery> getImageGalleryPaging(int id, int pageSize, int pageIndex) throws Exception {
        DBContext db = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM (\n"
                + "                SELECT ROW_NUMBER()\n"
                + "                OVER(ORDER BY id) as Number,* FROM ImageGallery WHERE gallery_id=? \n"
                + "                )as dbNumber where Number between ? and ?";
        ArrayList<ImageGallery> list = new ArrayList<>();
        try {
            db = new DBContext();
            int from = pageSize * (pageIndex - 1) + 1;
            int to = pageSize * pageIndex;
            conn = db.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.setInt(2, from);
            pstmt.setInt(3, to);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                String img = db.getImagePath() + rs.getString("image");
                int gaID = rs.getInt("gallery_id");
                ImageGallery im = new ImageGallery(img, gaID);
                list.add(im);
            }
            return list;
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, pstmt, conn);
        }
    }

    public int getNumberPages(int id, int pageSize) throws Exception {
        DBContext db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT COUNT(id) as number FROM ImageGallery where gallery_id = ?";
        try {
            db = new DBContext();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

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
            db.closeConnection(rs, ps, con);
        }
        return -1;
    }

}
