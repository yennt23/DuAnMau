/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.shoponline.service;

import com.mycompany.shoponline.DomainModels.HoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface ChiTietHoaDonService {
    public ArrayList<HoaDonChiTiet>listhoadonct(String mahoadon);
    public boolean add(HoaDonChiTiet hoaDonChiTiet);
    
}
