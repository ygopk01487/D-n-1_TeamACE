/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_dal;

import DA1_Helper.sql_Helper;
import DA1_dto.NhaCungCap;
import java.sql.ResultSet;

/**
 *
 * @author Asus
 */
public class dalNhaCungCap {

    public static ResultSet GetHocVien;

    public static void ThemNhaCungCap(NhaCungCap hv) {

        String sql = "SET DATEFORMAT DMY INSERT INTO [dbo].[NhaCungCap]([TenNhaCungCap],"
                + "[SoDienThoai],[DiaChi],[Email])"
                + "VALUES(?,?,?,?)";
        sql_Helper.executeUpdate(sql,
                hv.getTenNhaCungCap(),
                hv.getSoDienThoai(),
                hv.getDiaChi(),
                hv.getEmail()
        );
    }

    public static ResultSet GetALLNCC() {
        String sql = "select * from NhaCungCap";
        return sql_Helper.executeQuery(sql);
    }

//    Hàm lấy Học Viên theo mã 
    public static ResultSet GetNCCTheoMa(int MaNCC) {
        String sql = "select * from NhaCungCap where MaNhaCungCap = ? ";
        return sql_Helper.executeQuery(sql, MaNCC);
    }

// Hàm sữa 
    public static void Sua(NhaCungCap hv) {
        String sql = " SET DATEFORMAT DMY "
                + " UPDATE [dbo].[NhaCungCap]  "
                + " SET [TenNhaCungCap] = ?  "
                + " ,[SoDienThoai] = ? "
                + " , [DiaChi] = ? "
                + "  , [Email] = ?  "
                + " WHERE MaNhaCungCap = ?  ";
        sql_Helper.executeUpdate(sql,
                hv.getTenNhaCungCap(),
                hv.getSoDienThoai(),
                hv.getDiaChi(),
                hv.getEmail(),
                hv.getMaNhaCungCap()
        );
    }

    public static void Xoa(String MaNhaCungCap) {
        String sql = "Delete from NhaCungCap Where MaNhaCungCap = ?";
        sql_Helper.executeUpdate(sql, MaNhaCungCap);
    }

    public static ResultSet TimKiem(String TenNhaCungCap, String SoDienThoai) {
        String sql = "select * from NhaCungCap where  TenNhaCungCap like  ?  or SoDienThoai =  ? or DiaChi =  ? ";

        return sql_Helper.executeQuery(sql, TenNhaCungCap, SoDienThoai);
    }
//
//    public static ResultSet Search(String TenNhanVien, String DiaChi) {
//        String sql = "{call spTimKiemHocViecCuaToiLaAiDiaChiLzJ(?, ?)}";
//        return sql_Helper.executeQuery(sql, TenNhanVien, DiaChi);
//    }

}
