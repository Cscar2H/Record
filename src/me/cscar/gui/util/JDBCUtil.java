package me.cscar.gui.util;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    private static Properties prs = new Properties();
    private static BasicDataSource bds = null;

    static {
        try {
            InputStream in = Thread.currentThread()
                    .getContextClassLoader()
                    .getResourceAsStream("db.properties");

            prs.load(in);
            Class.forName(prs.getProperty("driverClassName"));

            bds = BasicDataSourceFactory.createDataSource(prs);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() {
        try {
            Connection conn = bds.getConnection();
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new RuntimeException("数据库链接失败");
    }

    public static void close(ResultSet rs, PreparedStatement ps, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
