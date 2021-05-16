/**
 * Copyright (C) 2021, FPT University J3.L.P0017 Photographer
 *
 * Record of change: DATE Version Author DESCRIPTION 2021-05-13 1.0 NangNN First
 * Version
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author User
 */
public class DBContext {

    //    get connection
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=p0017";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, "sa", "sa");
    }

    //    get image path
    public String getImagePath() throws Exception {
        String imagePath;
        InitialContext initial = new InitialContext();
        Object obj = initial.lookup("java:comp/env");
        Context context = (Context) obj;
        imagePath = context.lookup("imagePath").toString();
        return imagePath;
    }

    //   close connection
    public void closeConnection(ResultSet rs, PreparedStatement ps, Connection cnn) throws Exception {
        try {
            if (rs != null) {
                if (!rs.isClosed()) {
                    rs.close();
                }
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (ps != null) {
                    if (!ps.isClosed()) {
                        ps.close();
                    }
                }
            } catch (Exception e) {
                throw e;
            } finally {
                if (cnn != null) {
                    if (!cnn.isClosed()) {
                        cnn.close();
                    }
                }
            }
        }
    }
}
