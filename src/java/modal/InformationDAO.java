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
import entity.Information;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class InformationDAO {
     public Information getInfor() throws Exception {
        DBContext db = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from Information";

        try {
            db = new DBContext();
            con = db.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                String address = rs.getString("address");
                String city = rs.getString("city");
                String country = rs.getString("country");
                String tel = rs.getString("tel");
                String email = rs.getString("email");
                String image = db.getImagePath() + rs.getString("image");
                Information in = new Information(address, city, country, tel, email, image);
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
