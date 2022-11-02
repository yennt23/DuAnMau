/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.DomainModels;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import net.bytebuddy.utility.nullability.MaybeNull;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "HoaDon")
public class HoaDon {

    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator", strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uniqueidentifier")
    private String id;
//    @Column(name = "IdKH")
//    private int idkh;
    @ManyToOne
    @JoinColumn(name = "IdKH")
    private KhachHang khachHang;
//    @Column(name = "IdNV")
//    private int idnv;
    @ManyToOne
    @JoinColumn(name = "IdNV")
    private NhanVien nhanVien;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "NgayTao")
    private Date NgayTao;
    @Column(name = "NgayThanhToan")
    private Date NgayThanhToan;
    @Column(name = "NgayShip")
    private Date NgayShip;
    @Column(name = "NgayNhan")
    private Date NgayNhan;
    @Column(name = "TinhTrang")
    private int tinhtrang;
    @Column(name = "TenNguoiNhan")
    private String tennguoinhan;
    @Column(name = "DiaChi")
    private String diachi;
    @Column(name = "Sdt")
    private String sdt;
    @OneToMany(mappedBy = "idHoaDonChiTiet.hoaDon")
    private List<HoaDonChiTiet> hoadonCT;

    public HoaDon() {
    }

    public HoaDon(String id, KhachHang khachHang, NhanVien nhanVien, String ma, Date NgayTao, Date NgayThanhToan, Date NgayShip, Date NgayNhan, int tinhtrang, String tennguoinhan, String diachi, String sdt) {
        this.id = id;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.ma = ma;
        this.NgayTao = NgayTao;
        this.NgayThanhToan = NgayThanhToan;
        this.NgayShip = NgayShip;
        this.NgayNhan = NgayNhan;
        this.tinhtrang = tinhtrang;
        this.tennguoinhan = tennguoinhan;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public Date getNgayShip() {
        return NgayShip;
    }

    public void setNgayShip(Date NgayShip) {
        this.NgayShip = NgayShip;
    }

    public Date getNgayNhan() {
        return NgayNhan;
    }

    public void setNgayNhan(Date NgayNhan) {
        this.NgayNhan = NgayNhan;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getTennguoinhan() {
        return tennguoinhan;
    }

    public void setTennguoinhan(String tennguoinhan) {
        this.tennguoinhan = tennguoinhan;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public List<HoaDonChiTiet> getListhoadonCT() {
        return hoadonCT;
    }

    public void sethoadonCT(List<HoaDonChiTiet> hoadonCT) {
        this.hoadonCT = hoadonCT;
    }

    

   
}
