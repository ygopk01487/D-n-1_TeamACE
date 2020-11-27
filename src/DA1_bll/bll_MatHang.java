/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_bll;

import DA1_Helper.ThongBao;
import DA1_dal.dal_MatHang;
import DA1_dto.MatHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
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
        Object obj[] = new Object[9];
        try {
            while (rs.next()) {
                obj[0] = rs.getInt("MaMatHang");
                obj[1] = rs.getString("TenMatHang");
                obj[2] = rs.getInt("SoLuong");
                obj[3] = rs.getString("NhaSanXuat");
                obj[4] = rs.getDouble("GiaNhap");
                obj[5] = rs.getDouble("GiaBan");
                obj[6] = rs.getString("BaoHanh");
                obj[7] = rs.getString("MoTa");
                obj[8] = rs.getString("HinhAnh");
                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger("Thông báo", "Lỗi load dữ liệu từ Database");
        }
    }
     //Load theo mã
    public static MatHang LoadTheoMa(String MaMatHang) {
        ResultSet rs = dal_MatHang.LoadTheoMa(MaMatHang);
        try {
            if (rs.next()) {
                MatHang mt = new MatHang();
                mt.setMaMatHang(rs.getInt("MaMatHang"));
                mt.setTenMatHang(rs.getString("TenMatHang"));
                mt.setSoLuong(rs.getInt("SoLuong"));
                mt.setNhaSanXuat(rs.getString("NhaSanXuat"));
                mt.setGiaNhap(rs.getDouble("GiaNhap"));
                mt.setGiaBan(rs.getDouble("GiaBan"));
                mt.setBaoHanh(rs.getString("BaoHanh"));
                mt.setMoTa(rs.getString("MoTa"));
                mt.setHinhAnh(rs.getString("HinhAnh"));
                return mt;
            }
        } catch (SQLException ex) {
            Logger.getLogger("Thông báo", "Lỗi load dữ liệu từ Database");
        }
        return null;
    }
    //Hàm kiểm tra
    //Thêm
    public static void Them(MatHang mh) {
        //Hàm kiể tra
        //Hàm từ dal
        dal_MatHang.Them(mh);
    }
    //Sửa
    public static void Sua(MatHang mh) {
        //Hàm kiể tra
        //Hàm từ dal
        dal_MatHang.Sua(mh);
    }
    //Xóa
    public static void Them(List<String> lstMaMatHang) {
        for (String MaMH: lstMaMatHang) {
            dal_MatHang.Xoa(MaMH);
        }
    }
}
