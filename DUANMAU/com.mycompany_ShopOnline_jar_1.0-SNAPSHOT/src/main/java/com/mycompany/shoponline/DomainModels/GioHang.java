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
@Table(name = "GioHang")
public class GioHang {
    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
   
    @GeneratedValue(generator = "generator")
    @Column(columnDefinition = "uniqueidentifier")
    private String id;
    
//    @Column(name = "idKH")
//    private int idKH;
    @OneToOne
    @JoinColumn(name = "idKH")
    private KhachHang khachHang;

    @Column(name = "Ma")
    private String ma;
    
    @Column(name = "NgayTao")
    private Date ngayTao;
    
    @Column(name = "NgayThanhToan")
    private Date ngayThanhToan;
    
    @Column(name = "TenNguoiNhan")
    private String tenNguoiNhan;
    
    @Column(name = "DiaChi")
    private String diaChi;
    
    @Column(name = "Sdt")
    private String sdt;
    
    @Column(name = "TinhTrang")
    private int tinhTrang;
    
    @OneToMany(mappedBy = "idGioHangChiTiet.giohang")
    private List<GioHangChiTiet> listGioHangChiTiet;
    
    public GioHang(String id, KhachHang khachHang, String ma, Date ngayTao, Date ngayThanhToan, String tenNguoiNhan, String diaChi, String sdt, int tinhTrang) {
        this.id = id;
        this.khachHang = khachHang;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.tinhTrang = tinhTrang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<GioHangChiTiet> getListGioHangChiTiet() {
        return listGioHangChiTiet;
    }

    public void setListGioHangChiTiet(List<GioHangChiTiet> listGioHangChiTiet) {
        this.listGioHangChiTiet = listGioHangChiTiet;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    
    
   
}
