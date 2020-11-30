/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_bll;

import DA1_Helper.ThongBao;
import DA1_dal.dalNhaCungCap;
import DA1_dto.NhaCungCap;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class bllNhaCungCap {

//    Hàm Thêm 
    public static void ThemNhaCungCap(NhaCungCap hv) {
//        Kiểm tra tên đăng nhập đã tồn tại 

        dalNhaCungCap.ThemNhaCungCap(hv);
    }

    public static void LoadNhaCungCap(JTable tbl) {
        try {
            DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
            tbModel.setRowCount(0);
//        Lấy dữ liệu danh sách từ tầng Dal
            ResultSet rs = dalNhaCungCap.GetALLNCC();
            Object obj[] = new Object[6];
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaNhaCungCap");
                obj[2] = rs.getString("TenNhaCungCap");
                obj[3] = rs.getString("SoDienThoai");
                obj[4] = rs.getString("DiaChi");
                obj[5] = rs.getString("Email");

                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThpngBaoDonGian("Thông Báo Lỗi", "Lỗi lấy Danh Sách Nhà Cung Cấp!!");
        }
    }

    public static NhaCungCap LayNCCtheoMa(int MaNhaCungCap) {
        ResultSet rs = dalNhaCungCap.GetNCCTheoMa(MaNhaCungCap);

        try {
            if (rs.next()) {
                // nếu có nhân Viên
                NhaCungCap hv = new NhaCungCap();
                hv.setMaNhaCungCap(rs.getInt("MaNhaCungCap"));
                hv.setTenNhaCungCap(rs.getString("TenNhaCungCap"));
                hv.setSoDienThoai(rs.getString("SoDienThoai"));
                hv.setDiaChi(rs.getString("DiaChi"));
                hv.setEmail(rs.getString("Email"));
                // trả về 
                return hv;
            }

        } catch (SQLException ex) {

            ThongBao.ThpngBaoDonGian("Thông Báo", "Lỗi lấy Nhà Cung Cấp Theo Mã");

        }
        return null;
    }

    public static boolean KiemTraHocVien(NhaCungCap hv) {
        if (hv.getTenNhaCungCap().trim().isEmpty()) {
            ThongBao.ThpngBaoDonGian("thông báo", " tên không được bỏ trống");
            return false;
        }
        if (hv.getTenNhaCungCap().length() < 5) {
            ThongBao.ThpngBaoDonGian("thông báo ", "tên tối thiểu 5 kí tự ");

        }
        return true;

    }

    public static void TimKiemNCC(JTable tbl, String TenNhaCungCap, String SoDienThoai) {

        DefaultTableModel tblModel = (DefaultTableModel) tbl.getModel();
        tblModel.setRowCount(0);
//        Lấy dữ liệu danh sách từ DAl
        ResultSet rs = dalNhaCungCap.TimKiem(TenNhaCungCap, SoDienThoai);

        Object obj[] = new Object[6];

        try {
            while (rs.next()) {
                obj[0] = tblModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaNhaCungCap");
                obj[2] = rs.getString("TenNhaCungCap");
                obj[3] = rs.getString("SoDienThoai");
                obj[4] = rs.getString("DiaChi");
                obj[5] = rs.getString("Email");
                
                tblModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThpngBaoDonGian("Thông Báo Lỗi", "Lỗi Tìm Kiếm Học Viên");
        }

    }

    public static void Sua(NhaCungCap hv) {
//        Kiểm tra thông tin học viên
        if (!KiemTraHocVien(hv)) {
            return;
        }
        dalNhaCungCap.Sua(hv);
    }

    public static void Xoa(List<String> LstMaNhaCungCap) {

        for (String MaNhaCungCap : LstMaNhaCungCap) {
            dalNhaCungCap.Xoa(MaNhaCungCap);
        }
    }

    public static void TimKiem(JTable tbl, String TenNhanVien, String DiaChi) {
//        DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
//        tbModel.setRowCount(0); //Bỏ hết các dòng đang có trong table
//        //Lấy dữ liệu nhân viên từ tầng dal
//        ResultSet rs = dalNhaCungCap.Search(TenNhanVien, DiaChi);
//        Object obj[] = new Object[11];
//        try {
//            while (rs.next()) {
//              
//
//                tbModel.addRow(obj);
//            }
//        } catch (SQLException ex) {
//            ThongBao.ThpngBaoDonGian("DiaChi Tim Kiam ERR", "Lổi Tìm Kiếm ");
//        }
    }
}
