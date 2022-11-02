/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.service.Impl;

import com.mycompany.shoponline.DomainModels.ChiTietSP;
import com.mycompany.shoponline.Reponsitories.impl.ChiTietSPRepository;
import com.mycompany.shoponline.Reponsitories.IChiTietSPRepository;
import java.util.ArrayList;
import com.mycompany.shoponline.service.ChiTietSPService;

/**
 *
 * @author DELL
 */
public class ChiTietSPServiceImpl implements ChiTietSPService {

    IChiTietSPRepository sanPhamRepository = new ChiTietSPRepository();

    @Override
    public ArrayList<ChiTietSP> getlist() {
        return sanPhamRepository.getlistform();
    }

    @Override
    public boolean xoa(String id) {
        return sanPhamRepository.xoa(id);
    }

    @Override
    public boolean add(ChiTietSP ctsp) {
        return sanPhamRepository.add(ctsp);
    }

    @Override
    public ChiTietSP getById(String id) {
        return sanPhamRepository.getById(id);
    }

    @Override
    public boolean update(String id, ChiTietSP sp) {
        return sanPhamRepository.update(id, sp);
    }
}
