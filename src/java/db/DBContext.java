/**
 * Copyright (C) 2021, FPT University<br>
 * J3.L.P0017<br>
 * Photographer<br>
 *
 * Record of change:<br>
 * DATE ------- Version ----------- Author -------- DESCRIPTION<br>
 * 2021-05-13 - 1.0 --------------- NangNN -------- First Version<br>
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
 * This class configurate to connect data from database
 *
 * @author nangnnhe130538
 */
public class DBContext {

    /**
     *
     * Get connection of your database
     *
     * @return connection
     * @throws Exception
     */
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
        if (instance == null || instance.trim().isEmpty()) {
            url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
    /*Insert your other code right after this comment*/
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    /**
     * Store the server name
     */
    private final String serverName = "localhost";
    /**
     * Store the database name
     */
    private final String dbName = "p0017";
    /**
     * Store the port number
     */
    private final String portNumber = "1433";
    private final String instance = "";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    /**
     * Store the account
     */
    private final String userID = "sa";
    /**
     * Store the password
     */
    private final String password = "123";

    /**
     * When you are done with using your connection, you need close in order to
     * release any other database resource
     *
     * @param ps PreparedStatement
     * @throws Exception
     */
    public void closePreparedStatement(PreparedStatement ps) throws Exception {
        if (ps != null && !ps.isClosed()) {
            ps.close();;
        }
    }

    /**
     * When you are done with using your connection, you need close in order to
     * release any other database resource
     *
     * @param con Connection
     * @throws Exception
     */
    public void closeConnection(Connection con) throws Exception {
        if (con != null && !con.isClosed()) {
            con.close();;
        }
    }

    /**
     * When you are done with using your connection, you need close in order to
     * release any other database resource
     *
     * @param rs ResultSet
     * @throws Exception
     */
    public void closeResultSet(ResultSet rs) throws Exception {
        if (rs != null && !rs.isClosed()) {
            rs.close();;
        }
    }

    public String getImagePath() throws Exception {
        String imagePath;
        InitialContext initial = new InitialContext();
        Object obj = initial.lookup("java:comp/env");
        Context context = (Context) obj;
        imagePath = context.lookup("imagePath").toString();
        return imagePath;
    }
}
