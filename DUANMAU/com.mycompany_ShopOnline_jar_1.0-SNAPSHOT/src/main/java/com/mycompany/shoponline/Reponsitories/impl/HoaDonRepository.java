/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.Reponsitories.impl;

import com.mycompany.shoponline.DomainModels.ChiTietSP;
import com.mycompany.shoponline.DomainModels.HoaDon;
import com.mycompany.shoponline.Reponsitories.IHoaDonRepository;
import com.mycompany.shoponline.utilities.HibernatUtil;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class HoaDonRepository implements IHoaDonRepository{

    @Override
    public ArrayList<HoaDon> getAll() {
        Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<HoaDon> list = (ArrayList<HoaDon>) session.createCriteria(HoaDon.class).list();
                session.close();
        return list;
    }

    @Override
    public boolean add(HoaDon hoadon) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(hoadon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;    
    }
    @Override
    public HoaDon getById(String id) {
        Session session = HibernatUtil.getFACTORY().openSession();
        HoaDon hoadon =  (HoaDon) session.get(HoaDon.class, id);
        session.close();
        return hoadon;
    }
    public boolean update( String id,HoaDon hoadon) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(id, hoadon);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<HoaDon> getByTrangThai(int trangthai) {
        Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<HoaDon> list = (ArrayList<HoaDon>) session.createCriteria(HoaDon.class).list();
        session.close();
        ArrayList<HoaDon> listTheoTrangThai = new ArrayList<>();
        for(HoaDon hoadon : list) {
            if(hoadon.getTinhtrang() == trangthai) {
                listTheoTrangThai.add(hoadon);
            }
        }
        return listTheoTrangThai;
    }
}
