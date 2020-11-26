/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_dal;
import DA1_Helper.sql_Helper;
import java.sql.*;

/**
 *
 * @author y go
 */
public class dal_MatHang {
    //Load dữ liệu
    public static ResultSet LoadAll() {
        String sql = "select * from MatHang ";
        return sql_Helper.executeQuery(sql);
    }
     //load dữ liệu theo mã
    public static ResultSet LoadTheoMa(String MaMatHang) {
        String sql = "select * from MatHang where MaMathang = ?";
        return sql_Helper.executeQuery(sql, MaMatHang);
    }
    //Thêm
    //Sửa
    //Xóa
}
