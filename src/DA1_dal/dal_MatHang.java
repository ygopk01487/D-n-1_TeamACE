/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_dal;

import DA1_Helper.Chuyen_Doi;
import DA1_Helper.sql_Helper;
import DA1_dto.MatHang;
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
    public static void Them(MatHang mh) {
        String sql = "INSERT INTO [dbo].[MatHang] "
                + "           ([TenMatHang] "
                + "           ,[SoLuong] "
                + "           ,[NhaSanXuat] "
                + "           ,[GiaNhap] "
                + "           ,[GiaBan] "
                + "           ,[BaoHanh] "
                + "           ,[MoTa] "
                + "           ,[HinhAnh]) "
                + "     VALUES "
                + "           (? "
                + "           ,? "
                + "           ,? "
                + "           ,? "
                + "           ,? "
                + "           ,? "
                + "           ,? "
                + "           ,?)";
        sql_Helper.executeUpdate(sql, mh.getTenMatHang(),
                mh.getSoLuong(),
                mh.getNhaSanXuat(),
                mh.getGiaNhap(),
                mh.getGiaBan(),
                mh.getBaoHanh(),
                mh.getMoTa(),
                mh.getHinhAnh());
    }

    //Sửa
    public static void Sua(MatHang mh) {
        String sql = "UPDATE [dbo].[MatHang] "
                + "   SET [TenMatHang] = ? "
                + "      ,[SoLuong] = ? "
                + "      ,[NhaSanXuat] = ? "
                + "      ,[GiaNhap] = ? "
                + "      ,[GiaBan] = ? "
                + "      ,[BaoHanh] = ? "
                + "      ,[MoTa] = ? "
                + "      ,[HinhAnh] = ? "
                + " WHERE MaMatHang = ?";
        sql_Helper.executeUpdate(sql, mh.getTenMatHang(),
                mh.getSoLuong(),
                mh.getNhaSanXuat(),
                Chuyen_Doi.SoString(mh.getGiaNhap()),
                Chuyen_Doi.SoString(mh.getGiaBan()),
                mh.getBaoHanh(),
                mh.getMoTa(),
                mh.getHinhAnh(),
                mh.getMaMatHang() );
    }

    //Xóa
    public static void Xoa(String MaMatHang) {
        String sql = "Delete from MatHang where MaMatHang = ?";
        sql_Helper.executeUpdate(sql, MaMatHang);
    }
}
