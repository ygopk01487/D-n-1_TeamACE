/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_bll;

import DA1_dal.dalChucVu;
import DA1_dal.dalNhanVien;
import DA1_dto.NhanVien;
import DA1_Helper.Chuyen_Doi;
import DA1_Helper.ThongBao;
import java.sql.*;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class bllNhanVien {

    public static void LoadNhanVien(JTable tbl) {
        try {
            DefaultTableModel tbModel = (DefaultTableModel) tbl.getModel();
            tbModel.setRowCount(0);
            ResultSet rs = dalNhanVien.LayNhanVien();
            Object obj[] = new Object[12];
            while (rs.next()) {
                obj[0] = tbModel.getRowCount() + 1;
                obj[1] = rs.getInt("MaNhanVien");
                obj[2] = rs.getString("TenNhanVien");
                boolean gt = rs.getBoolean("GioiTinh");
                if (gt) {
                    obj[3] = "Nam";
                } else {
                    obj[3] = "Nữ";
                }
                obj[4] = Chuyen_Doi.LayNgayString(rs.getDate("NgaySinh"));
                obj[5] = rs.getString("MaChucVu");
                obj[6] = rs.getString("SoDienThoai");
                obj[7] = rs.getString("CMND");
                obj[8] = rs.getString("DiaChi");
                obj[9] = Chuyen_Doi.SoString(rs.getDouble("Luong"));
                obj[10] = rs.getString("HinhAnh");

                tbModel.addRow(obj);
            }
        } catch (SQLException ex) {
            ThongBao.ThpngBaoDonGian("Thông Báo Lỗi", "Lỗi lấy danh sách nhân viên");
        }
    }

    public static NhanVien LayNhanVientheoMa(int MaNhanVien) {
        ResultSet rs = dalNhanVien.LayNhanVienTheoMa(MaNhanVien);

        try {
            if (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getInt("MaNhanVien"));
                nv.setTenNhanVien(rs.getString("TenNhanVien"));
                nv.setGioiTinh(rs.getBoolean("GioiTinh"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setChucVu(rs.getInt("MaChucVu"));
                nv.setCMND(rs.getString("CMND"));
                nv.setSoDienThoai(rs.getString("SoDienThoai"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setLuong(rs.getDouble("Luong"));
                nv.setHinhAnh(rs.getString("HinhAnh"));

                return nv;
            }

        } catch (SQLException ex) {

            ThongBao.ThpngBaoDonGian("Thông Báo", "Lỗi lấy Nhân Viên theo mã");

        }
        return null;
    }

    public static String ChucVu(int MaChucVu) {
        ResultSet rs = dalChucVu.LayChucVuTheoMa(MaChucVu);
        try {
            if (rs.next()) {
                return rs.getString("TenChucVu");
            }
        } catch (SQLException ex) {
            ThongBao.ThpngBaoDonGian("Thông báo", "Lỗi lấy tên chức vụ");
        }
        return "";
    }

    public static void ThemNhanVien(NhanVien hv) {

        dalNhanVien.ThemNhanVien(hv);
    }

    public static void SuaNhanVien(NhanVien hv) {

        dalNhanVien.SuaNhanVien(hv);
    }
     public static void XoaNhanVien(List<String> LstMaNV) {

        for (String MaNhanVien : LstMaNV) {
            dalNhanVien.XoaNhanVien(MaNhanVien);
        }
    }
}
