/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.service.Impl;

import com.mycompany.shoponline.DomainModels.NhanVien;
import com.mycompany.shoponline.Reponsitories.INhanVienRepository;
import com.mycompany.shoponline.Reponsitories.impl.NhanVienRepository;
import com.mycompany.shoponline.service.NhanVienService;
import java.util.List;

/**
 *
 * @author DELL
 */
public class NhanVienServiceImpl implements NhanVienService {

    private INhanVienRepository nhanVienRepository = new NhanVienRepository();

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRepository.getAll();
    }

    @Override
    public boolean add(NhanVien nv) {
        return nhanVienRepository.add(nv);
    }

    @Override
    public boolean update(String id, NhanVien nv) {
        return nhanVienRepository.update(id, nv);
    }

    @Override
    public NhanVien getbymanv(String ma) {
        return nhanVienRepository.getbymanv(ma);
    }

}
