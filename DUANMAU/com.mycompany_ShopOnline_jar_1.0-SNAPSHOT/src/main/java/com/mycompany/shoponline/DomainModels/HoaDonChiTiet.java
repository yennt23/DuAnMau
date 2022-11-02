/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.DomainModels;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "HoaDonChiTiet")
public class HoaDonChiTiet {
    @EmbeddedId
    private IdHoaDonChiTiet idHoaDonChiTiet;
    @Column(name = "SoLuong")
    private int SoLuong;
    @Column(name = "DonGia")
    private long Dongia;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(IdHoaDonChiTiet idHoaDonChiTiet, int SoLuong, long Dongia) {
        this.idHoaDonChiTiet = idHoaDonChiTiet;
        this.SoLuong = SoLuong;
        this.Dongia = Dongia;
    }

    public IdHoaDonChiTiet getIdHoaDonChiTiet() {
        return idHoaDonChiTiet;
    }

    public void setIdHoaDonChiTiet(IdHoaDonChiTiet idHoaDonChiTiet) {
        this.idHoaDonChiTiet = idHoaDonChiTiet;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public long getDongia() {
        return Dongia;
    }

    public void setDongia(long Dongia) {
        this.Dongia = Dongia;
    }
    
}
