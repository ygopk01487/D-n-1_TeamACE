/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DA1_dto;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class NhanVien {
    int MaNhanVien, ChucVu;
    String TenNhanVien, CMND, SoDienThoai, DiaChi, HinhAnh;
    boolean GioiTinh;
    Date NgaySinh;
    double Luong;

    public NhanVien(int ChucVu, String TenNhanVien, String CMND, String SoDienThoai, String DiaChi, String HinhAnh, boolean GioiTinh, Date NgaySinh, double Luong) {
        this.ChucVu = ChucVu;
        this.TenNhanVien = TenNhanVien;
        this.CMND = CMND;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
        this.HinhAnh = HinhAnh;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.Luong = Luong;
    }

    public NhanVien(int MaNhanVien, int ChucVu, String TenNhanVien, String CMND, String SoDienThoai, String DiaChi, String HinhAnh, boolean GioiTinh, Date NgaySinh, double Luong) {
        this.MaNhanVien = MaNhanVien;
        this.ChucVu = ChucVu;
        this.TenNhanVien = TenNhanVien;
        this.CMND = CMND;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
        this.HinhAnh = HinhAnh;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.Luong = Luong;
    }

    public NhanVien() {
    }

    public int getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(int MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public int getChucVu() {
        return ChucVu;
    }

    public void setChucVu(int ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }
    
}
