/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.ViewModel;

/**
 *
 * @author DELL
 */
public class ChiTietSPView {
    String stt;
    String masp;
    String tensp;
    int nambh;
    String mota;
    long soluongSp;
    long gianhap;
    long giaban;

    public ChiTietSPView(String stt, String masp, String tensp, int nambh, String mota, long soluongSp, long gianhap, long giaban) {
        this.stt = stt;
        this.masp = masp;
        this.tensp = tensp;
        this.nambh = nambh;
        this.mota = mota;
        this.soluongSp = soluongSp;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }

    

    public ChiTietSPView() {
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getNambh() {
        return nambh;
    }

    public void setNambh(int nambh) {
        this.nambh = nambh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public long getSoluongSp() {
        return soluongSp;
    }

    public void setSoluongSp(long soluongSp) {
        this.soluongSp = soluongSp;
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

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }
    
    
}
