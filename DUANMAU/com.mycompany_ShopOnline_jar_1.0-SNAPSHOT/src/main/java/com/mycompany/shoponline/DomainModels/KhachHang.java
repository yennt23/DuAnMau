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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 *
 * @author DELL
 */
@Entity
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
   
    @GeneratedValue(generator = "generator")
    @Column(columnDefinition = "uniqueidentifier")
    private String id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "TenDem")
    private String Tendem;
    @Column(name = "Ho")
    private String ho;
    @Column(name = "NgaySinh")
    private Date Ngaysinh;
    @Column(name = "Sdt")
    private String sdt;
    @Column(name = "DiaChi")
    private String diachi;
    @Column(name = "ThanhPho")
    private String thanhpho;
    @Column(name = "QuocGia")
    private String quocgia;
    @Column(name = "MatKhau")
    private String matkhau;
    @OneToOne(mappedBy = "khachHang")
    private GioHang gioHang;
    @OneToMany(mappedBy = "khachHang")
    private List<HoaDon>listHoaDon;
    
    public KhachHang() {
    }

    public KhachHang(String id, String ma, String ten, String Tendem, String ho, Date Ngaysinh, String sdt, String diachi, String thanhpho, String quocgia, String matkhau) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.Tendem = Tendem;
        this.ho = ho;
        this.Ngaysinh = Ngaysinh;
        this.sdt = sdt;
        this.diachi = diachi;
        this.thanhpho = thanhpho;
        this.quocgia = quocgia;
        this.matkhau = matkhau;
    }

    public GioHang getGioHang() {
        return gioHang;
    }

    public void setGioHang(GioHang gioHang) {
        this.gioHang = gioHang;
    }

    public List<HoaDon> getListHoaDon() {
        return listHoaDon;
    }

    public void setListHoaDon(List<HoaDon> listHoaDon) {
        this.listHoaDon = listHoaDon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTendem() {
        return Tendem;
    }

    public void setTendem(String Tendem) {
        this.Tendem = Tendem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }
    
    
}
