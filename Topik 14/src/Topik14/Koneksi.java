/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Topik14;

import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.cj.jdbc.MysqlDataSource;


public class Koneksi {
    private final MysqlDataSource dataSource = new MysqlDataSource();
    private final String DB_URL = "jdbc:mysql://localhost:3306/"
            + "penjualan?serverTimezone=Asia/Jakarta";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "";

   

    public Connection getConnection() throws SQLException {
        dataSource.setUrl(DB_URL);
        dataSource.setUser(DB_USERNAME);
        dataSource.setPassword(DB_PASSWORD);
        Connection conn = dataSource.getConnection();
        
        return conn;
    }
    
}
