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
import entity.Introduction;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class IntroductionDAO {
     public Introduction getIntroduction() throws Exception {
        DBContext db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from Intro";

        try {
            db = new DBContext();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                String image = db.getImagePath() + rs.getString("image");
                String des = rs.getString("descript");
                String about = rs.getString("aboutme");
                Introduction in = new Introduction(image, des, about);
                return in;
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            db.closeConnection(rs, ps, con);
        }
        return null;
    }
}
