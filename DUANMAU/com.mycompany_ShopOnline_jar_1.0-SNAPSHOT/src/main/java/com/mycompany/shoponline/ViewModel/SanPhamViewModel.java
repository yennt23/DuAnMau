/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.ViewModel;

/**
 *
 * @author DELL
 */
public class SanPhamViewModel {
    private String id;
    private int nambh;
    private String mota;
    private long soluongton;
    private long gianhap;
    private String trangthai;

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(String id, int nambh, String mota, long soluongton, long gianhap, String trangthai) {
        this.id = id;
        this.nambh = nambh;
        this.mota = mota;
        this.soluongton = soluongton;
        this.gianhap = gianhap;
        this.trangthai = trangthai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    
    
}
