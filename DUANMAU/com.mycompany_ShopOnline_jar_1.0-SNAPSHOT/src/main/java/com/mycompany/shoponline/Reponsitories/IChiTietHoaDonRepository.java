/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.shoponline.Reponsitories;

import com.mycompany.shoponline.DomainModels.HoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IChiTietHoaDonRepository {
    public ArrayList<HoaDonChiTiet>Listhoadonct(String mahoadon);
    public boolean add(HoaDonChiTiet hoaDonChiTiet);
}
