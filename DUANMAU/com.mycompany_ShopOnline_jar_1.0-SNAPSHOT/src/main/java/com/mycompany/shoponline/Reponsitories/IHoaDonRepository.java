/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.shoponline.Reponsitories;

import com.mycompany.shoponline.DomainModels.ChiTietSP;
import com.mycompany.shoponline.DomainModels.HoaDon;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IHoaDonRepository {

    public ArrayList<HoaDon> getAll();

    public boolean add(HoaDon hoadon);

    public HoaDon getById(String id);

    public boolean update(String id, HoaDon hoadon);
    
    public ArrayList<HoaDon> getByTrangThai(int trangthai);
}
