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
 * @author Administrator
 */
public class dalChucVu {

    public static ResultSet LayChucVuTheoMa(int MaChucVu) {
        String sql = "SELECT * FROM ChucVu WHERE MaChucVu = ?";
        return sql_Helper.executeQuery(sql, MaChucVu);
    }

    public static ResultSet LayChucVu() {
        String sql = "SELECT * FROM ChucVu";
        return sql_Helper.executeQuery(sql);
    }
}
