/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.DomainModels;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import net.bytebuddy.utility.nullability.MaybeNull;

/**
 *
 * @author DELL
 */
@Embeddable
public class IdHoaDonChiTiet implements Serializable {
//    @Column(name = "Idhoadon")
//    private int idhoadon;

    @ManyToOne
    @JoinColumn(name = "Idhoadon")
    private HoaDon hoaDon;
//    @Column(name = "IdChitietSP")
//    private int idChitietSP;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdChitietSP")
    private ChiTietSP chiTietSP;

    public IdHoaDonChiTiet() {
    }

    public IdHoaDonChiTiet(HoaDon hoaDon, ChiTietSP chiTietSP) {
        this.hoaDon = hoaDon;
        this.chiTietSP = chiTietSP;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public ChiTietSP getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(ChiTietSP chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

    
}
