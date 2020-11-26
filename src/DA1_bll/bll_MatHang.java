/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_bll;

import DA1_Helper.ThongBao;
import DA1_dal.dal_MatHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author y go
 */
public class bll_MatHang {
    //Load dữ liệu
    public static void LoadAll(JTable tbl) {
        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
        tbModel.setRowCount(0); //Bỏ hết các dòng đang có trong table
        //Lấy dữ liệu nhân viên từ tầng dal
        ResultSet rs = dal_MatHang.LoadAll();
        Object obj[] = new Object[10];
        try {
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaMatHang");
                obj[2] = rs.getString("TenMatHang");
                obj[3] = rs.getInt("SoLuong");
                obj[4] = rs.getString("NhaSanXuat");
                obj[5] = rs.getDouble("GiaNhap");
                obj[6] = rs.getDouble("GiaBan");
                obj[7] = rs.getString("BaoHanh");
                obj[8] = rs.getString("MoTa");
                obj[9] = rs.getString("HinhAnh");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger("Thông báo", "Lỗi load dữ liệu từ Database");
        }
    }
}
