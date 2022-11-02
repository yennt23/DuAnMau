/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.service.Impl;

import com.mycompany.shoponline.DomainModels.HoaDonChiTiet;
import com.mycompany.shoponline.Reponsitories.IChiTietHoaDonRepository;
import com.mycompany.shoponline.Reponsitories.impl.ChiTietHoaDonRepository;
import com.mycompany.shoponline.service.ChiTietHoaDonService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ChiTietHoaDonServiceImpl implements ChiTietHoaDonService{
    IChiTietHoaDonRepository chiTietHoaDonRepository=new ChiTietHoaDonRepository();
    @Override
    public ArrayList<HoaDonChiTiet> listhoadonct(String mahoadon) {
       return chiTietHoaDonRepository.Listhoadonct(mahoadon);
    }

    @Override
    public boolean add(HoaDonChiTiet hoaDonChiTiet) {
        return chiTietHoaDonRepository.add(hoaDonChiTiet);
    }
    
}
