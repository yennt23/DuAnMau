/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.service.Impl;

import com.mycompany.shoponline.DomainModels.ChiTietSP;
import com.mycompany.shoponline.DomainModels.HoaDon;
import com.mycompany.shoponline.Reponsitories.IHoaDonRepository;
import com.mycompany.shoponline.Reponsitories.impl.HoaDonRepository;
import com.mycompany.shoponline.service.HoaDonService;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class HoaDonServiceImpl implements HoaDonService{
    IHoaDonRepository hoaDonRepository = new HoaDonRepository();
    @Override
    public ArrayList<HoaDon> getAll() {
        return hoaDonRepository.getAll();
    }

    @Override
    public boolean add(HoaDon hoadon) {
        return hoaDonRepository.add(hoadon);
    }

    @Override
    public HoaDon getById(String id) {
        return hoaDonRepository.getById(id);
    }
     public boolean update( String id,HoaDon hoadon) {
         return hoaDonRepository.update(id, hoadon);
     }

    @Override
    public ArrayList<HoaDon> getByTrangThai(int trangthai) {
        return hoaDonRepository.getByTrangThai(trangthai);
    }
}
