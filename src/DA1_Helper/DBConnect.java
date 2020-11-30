/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_Helper;

import java.io.IOException;
import java.sql.*;


public class DBConnect {

    private static String DB_URL = "jdbc:sqlserver://localhost;"
            + "databaseName=QLHV;";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "123123";
    public static Connection conn;

    static com.sun.jdi.connect.spi.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public DBConnect() {
        conn = getConnection(DB_URL, USER_NAME, PASSWORD);
    }

    public static Connection getConnection(String dbURL, String userName,
            String password) {
        
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!" );
            ex.printStackTrace();
        }
        return conn;
    }

    public static ResultSet ExecuteQuerySelect(String sql) {
        try {
            Statement stm = conn.createStatement();
            return stm.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println("lỗi SQL" + ex.getMessage());
            return null;
        }

    }

    //Hàm thực thi lệnh UPDATE, DELETE, INSERT
    public static int ExecuteQueryUpdate(String sql) {
        try {
            //Tạo Statement
            Statement stm = conn.createStatement();
            //Thực hiện truy vấn cập nhật dữ liệu
            return stm.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println("lỗi SQL" + ex.getMessage());
            return 0;
        }
    }
        public static void main(String[] args) throws SQLException, IOException {
           Connection c = getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println(c.toString());
            c.close();
    }
    
//    public static ResultSet LaySach() {
//        try {
//        //Câu lệnh SQL
//        String SQL = "Select * from Sach";
//        
//        //Tạo statement
//        Statement stm = conn.createStatement();
//        
//        //Thực thi câu lệnh và trả về bảng dữ liệu
//        ResultSet rs = stm.executeQuery(SQL);
//        return rs; //Trả về dữ liệu lấy đc
//        } catch (SQLException ex) {
//            System.out.println("Lỗi SQL");
//            return null;
//        }
//    }   
}
