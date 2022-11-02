/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.DomainModels;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "ChiTietSP")
public class ChiTietSP {

    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
   
    @GeneratedValue(generator = "generator")
    
    @Column(columnDefinition = "uniqueidentifier") 
    private String id;
//    @Column(name = "IdSP")
//    private int idsp;
    @ManyToOne
    @JoinColumn(name = "IdSP")
    private SanPham sanpham;
//    @Column(name = "IdNsx")
//    private int idnsx;
    @ManyToOne
    @JoinColumn(name = "IdNsx")
    private NSX nsx;
//    @Column(name = "IdMauSac")
//    private int idmausac;
    @ManyToOne
    @JoinColumn(name = "IdMauSac")
    private MauSac mauSac;
//    @Column(name = "IdDongSP")
//    private int iddongsp;
    @ManyToOne
    @JoinColumn(name = "IdDongSP")
    private DongSP dongSP;
    @Column(name = "NamBH")
    private int NamBH;
    @Column(name = "MoTa")
    private String Mota;
    @Column(name = "SoLuongTon")
    private long soluongton;
    @Column(name = "GiaNhap")
    private long gianhap;
    @Column(name = "GiaBan")
    private long giaban;

    @OneToMany(mappedBy = "idGioHangChiTiet.chiTietSP")
    private List<GioHangChiTiet> listGioHangChiTiet;
    @OneToMany(mappedBy = "idHoaDonChiTiet.chiTietSP")
    private List<HoaDonChiTiet> listHoaDonChiTiet;

    public ChiTietSP() {
    }

    public ChiTietSP(String id, SanPham sanpham, NSX nsx, MauSac mauSac, DongSP dongSP, int NamBH, String Mota, long soluongton, long gianhap, long giaban, List<GioHangChiTiet> listGioHangChiTiet, List<HoaDonChiTiet> listHoaDonChiTiet) {
        this.id = id;
        this.sanpham = sanpham;
        this.nsx = nsx;
        this.mauSac = mauSac;
        this.dongSP = dongSP;
        this.NamBH = NamBH;
        this.Mota = Mota;
        this.soluongton = soluongton;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.listGioHangChiTiet = listGioHangChiTiet;
        this.listHoaDonChiTiet = listHoaDonChiTiet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SanPham getSanpham() {
        return sanpham;
    }

    public void setSanpham(SanPham sanpham) {
        this.sanpham = sanpham;
    }

    public NSX getNsx() {
        return nsx;
    }

    public void setNsx(NSX nsx) {
        this.nsx = nsx;
    }

    public MauSac getMauSac() {
        return mauSac;
    }

    public void setMauSac(MauSac mauSac) {
        this.mauSac = mauSac;
    }

    public DongSP getDongSP() {
        return dongSP;
    }

    public void setDongSP(DongSP dongSP) {
        this.dongSP = dongSP;
    }

    public int getNamBH() {
        return NamBH;
    }

    public void setNamBH(int NamBH) {
        this.NamBH = NamBH;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }

    public long getSoluongton() {
        return soluongton;
    }

    public void setSoluongton(long soluongton) {
        this.soluongton = soluongton;
    }

    public long getGianhap() {
        return gianhap;
    }

    public void setGianhap(long gianhap) {
        this.gianhap = gianhap;
    }

    public long getGiaban() {
        return giaban;
    }

    public void setGiaban(long giaban) {
        this.giaban = giaban;
    }

    public List<GioHangChiTiet> getListGioHangChiTiet() {
        return listGioHangChiTiet;
    }

    public void setListGioHangChiTiet(List<GioHangChiTiet> listGioHangChiTiet) {
        this.listGioHangChiTiet = listGioHangChiTiet;
    }

    public List<HoaDonChiTiet> getListHoaDonChiTiet() {
        return listHoaDonChiTiet;
    }

    public void setListHoaDonChiTiet(List<HoaDonChiTiet> listHoaDonChiTiet) {
        this.listHoaDonChiTiet = listHoaDonChiTiet;
    }

    public ChiTietSP(String id, SanPham sanpham, int NamBH, String Mota, long soluongton, long gianhap, long giaban) {
        this.id = id;
        this.sanpham = sanpham;
        this.NamBH = NamBH;
        this.Mota = Mota;
        this.soluongton = soluongton;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }
    
    @Override
    public String toString() {
        return this.sanpham.getTen() + " - " + this.giaban;
    }
}
