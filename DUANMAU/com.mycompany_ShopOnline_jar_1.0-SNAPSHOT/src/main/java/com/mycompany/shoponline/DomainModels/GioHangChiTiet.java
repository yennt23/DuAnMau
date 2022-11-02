/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.DomainModels;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "GioHangChiTiet")
public class GioHangChiTiet {
    @EmbeddedId
    private GioHangChiTietId idGioHangChiTiet;
    @Column(name = "SoLuong")
    private int SoLuong;
    @Column(name = "DonGia")
    private long dongia;
    @Column(name = "DonGiaKhiGiam")
    private long dongiakhigiam;

    public GioHangChiTiet(GioHangChiTietId idGioHangChiTiet, int SoLuong, long dongia, long dongiakhigiam) {
        this.idGioHangChiTiet = idGioHangChiTiet;
        this.SoLuong = SoLuong;
        this.dongia = dongia;
        this.dongiakhigiam = dongiakhigiam;
    }

    public GioHangChiTiet() {
    }

    public GioHangChiTietId getIdGioHangChiTiet() {
        return idGioHangChiTiet;
    }

    public void setIdGioHangChiTiet(GioHangChiTietId idGioHangChiTiet) {
        this.idGioHangChiTiet = idGioHangChiTiet;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public long getDongia() {
        return dongia;
    }

    public void setDongia(long dongia) {
        this.dongia = dongia;
    }

    public long getDongiakhigiam() {
        return dongiakhigiam;
    }

    public void setDongiakhigiam(long dongiakhigiam) {
        this.dongiakhigiam = dongiakhigiam;
    }
    
}
