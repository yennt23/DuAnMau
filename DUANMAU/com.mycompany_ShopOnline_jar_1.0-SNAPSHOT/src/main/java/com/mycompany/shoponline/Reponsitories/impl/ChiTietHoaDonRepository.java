/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.Reponsitories.impl;

import com.mycompany.shoponline.DomainModels.HoaDon;
import com.mycompany.shoponline.DomainModels.HoaDonChiTiet;
import com.mycompany.shoponline.Reponsitories.IChiTietHoaDonRepository;
import com.mycompany.shoponline.utilities.HibernatUtil;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class ChiTietHoaDonRepository implements IChiTietHoaDonRepository{

    @Override
    public ArrayList<HoaDonChiTiet> Listhoadonct(String mahoadon) {
        Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<HoaDonChiTiet> list = (ArrayList<HoaDonChiTiet>) session.createCriteria(HoaDonChiTiet.class).list();
        ArrayList<HoaDonChiTiet> danhsachHoaDonChiTiet = new ArrayList<>();
        for(HoaDonChiTiet hdct: list) {
            if(hdct.getIdHoaDonChiTiet().getHoaDon().getId().equals(mahoadon)) {
                danhsachHoaDonChiTiet.add(hdct);
            }
        }
        return danhsachHoaDonChiTiet;

    }

    @Override
    public boolean add(HoaDonChiTiet hoaDonChiTiet) {
                Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hoaDonChiTiet);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
