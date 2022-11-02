/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.shoponline.service;

import com.mycompany.shoponline.DomainModels.NhanVien;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface NhanVienService {

    List<NhanVien> getAll();

    public boolean add(NhanVien nv);

    public boolean update(String id, NhanVien nv);
        NhanVien getbymanv(String ma);

}
