/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_dal;

import DA1_Helper.Chuyen_Doi;
import DA1_Helper.sql_Helper;
import DA1_dto.NhanVien;
import java.sql.*;

/**
 *
 * @author Administrator
 */
public class dalNhanVien {
    public static ResultSet LayNhanVien() {
        String sql = "select * from NhanVien";
        return sql_Helper.executeQuery(sql);
    }

    public static ResultSet LayNhanVienTheoMa(int MaNhanVien) {
        String sql = "select * from NhanVien where MaNhanVien = ?";
        return sql_Helper.executeQuery(sql, MaNhanVien);
    }

    public static void ThemNhanVien(NhanVien nv) {
        String sql = " SET DATEFORMAT DMY "
                + " INSERT INTO [dbo].[NhanVien] "
                + "           ([TenNhanVien],[GioiTinh],[NgaySinh],[MaChucVu],[CMND],[SoDienThoai],[DiaChi],[Luong],[HinhAnh])"
                + "		   VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        sql_Helper.executeUpdate(sql,
                nv.getTenNhanVien(),
                nv.isGioiTinh(),
                Chuyen_Doi.LayNgayString(nv.getNgaySinh()),
                nv.getChucVu(),
                nv.getCMND(),
                nv.getSoDienThoai(),
                nv.getDiaChi(),
                nv.getLuong(),
                nv.getHinhAnh()
        );
    }

    public static void SuaNhanVien(NhanVien nv) {
        String sql = " SET DATEFORMAT DMY "
                + " UPDATE [dbo].[NhanVien]"
                + "   SET [TenNhanVien] = ?,[GioiTinh] = ?,[NgaySinh] = ?,[MaChucVu] = ?,[CMND] = ?,[SoDienThoai] = ?,[DiaChi] = ?,[Luong] = ?,[HinhAnh] = ?"
                + " WHERE [MaNhanVien] = ?";
        sql_Helper.executeUpdate(sql,
                nv.getTenNhanVien(),
                nv.isGioiTinh(),
                Chuyen_Doi.LayNgayString(nv.getNgaySinh()),
                nv.getChucVu(),
                nv.getCMND(),
                nv.getSoDienThoai(),
                nv.getDiaChi(),
                nv.getLuong(),
                nv.getHinhAnh(),
                nv.getMaNhanVien()
        );
    }

    public static void XoaNhanVien(String MaNhanVien) {
        String sql = "delete from NhanVien where MaNhanVien = ?";
        sql_Helper.executeUpdate(sql, MaNhanVien);
    }
}
