/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.service.Impl;

import com.mycompany.shoponline.DomainModels.SanPham;
import com.mycompany.shoponline.Reponsitories.ISanPhamRepository;
import com.mycompany.shoponline.Reponsitories.impl.SanPhamRepository;
import com.mycompany.shoponline.service.SanPhamService;
import java.util.List;

/**
 *
 * @author DELL
 */
public class SanPhamServiceImpl implements SanPhamService {

    private ISanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    public List<SanPham> getAllSanPham() {
        return sanPhamRepository.findAll();
    }

}
