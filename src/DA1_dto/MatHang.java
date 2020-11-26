/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_dto;

/**
 *
 * @author y go
 */
public class MatHang {
    int MaMatHang;
    String TenMatHang;
    int SoLuong;
    String NhaSanXuat;
    double GiaNhap;
    double GiaBan;
    String BaoHanh;
    String MoTa;
    String HinhAnh;

    public MatHang() {
    }

    public MatHang(String TenMatHang, int SoLuong, String NhaSanXuat, double GiaNhap, double GiaBan, String BaoHanh, String MoTa, String HinhAnh) {
        this.TenMatHang = TenMatHang;
        this.SoLuong = SoLuong;
        this.NhaSanXuat = NhaSanXuat;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.BaoHanh = BaoHanh;
        this.MoTa = MoTa;
        this.HinhAnh = HinhAnh;
    }

    
    public MatHang(int MaMatHang, String TenMatHang, int SoLuong, String NhaSanXuat, double GiaNhap, double GiaBan, String BaoHanh, String MoTa, String HinhAnh) {
        this.MaMatHang = MaMatHang;
        this.TenMatHang = TenMatHang;
        this.SoLuong = SoLuong;
        this.NhaSanXuat = NhaSanXuat;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.BaoHanh = BaoHanh;
        this.MoTa = MoTa;
        this.HinhAnh = HinhAnh;
    }

    
    public int getMaMatHang() {
        return MaMatHang;
    }

    public void setMaMatHang(int MaMatHang) {
        this.MaMatHang = MaMatHang;
    }

    public String getTenMatHang() {
        return TenMatHang;
    }

    public void setTenMatHang(String TenMatHang) {
        this.TenMatHang = TenMatHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getNhaSanXuat() {
        return NhaSanXuat;
    }

    public void setNhaSanXuat(String NhaSanXuat) {
        this.NhaSanXuat = NhaSanXuat;
    }

    public double getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(double GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public double getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(double GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getBaoHanh() {
        return BaoHanh;
    }

    public void setBaoHanh(String BaoHanh) {
        this.BaoHanh = BaoHanh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }
    
}
