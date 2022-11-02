/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.ViewModel;

/**
 *
 * @author DELL
 */
public class NhanVienViewModel {
    private String manv;
    private String hoten;
     private String gt;
     private String sdt;

    public NhanVienViewModel() {
    }

    public NhanVienViewModel(String manv, String hoten, String gt, String sdt) {
        this.manv = manv;
        this.hoten = hoten;
        this.gt = gt;
        this.sdt = sdt;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
     
}
