/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.DomainModels;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author DELL
 */
@Embeddable
public class GioHangChiTietId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "IdGioHang")
    private GioHang giohang;

//    @Column(name = "IdChiTietSP")
//    private int IdChiTietSP;
    @ManyToOne
    @JoinColumn(name = "IdChiTietSP")
    private ChiTietSP chiTietSP;

    public GioHangChiTietId() {
    }

    public GioHangChiTietId(GioHang giohang, ChiTietSP chiTietSP) {
        this.giohang = giohang;
        this.chiTietSP = chiTietSP;
    }

    public GioHang getGiohang() {
        return giohang;
    }

    public void setGiohang(GioHang giohang) {
        this.giohang = giohang;
    }

    public ChiTietSP getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(ChiTietSP chiTietSP) {
        this.chiTietSP = chiTietSP;
    }

}
