/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.Reponsitories.impl;

import com.mycompany.shoponline.DomainModels.NhanVien;
import com.mycompany.shoponline.DomainModels.SanPham;
import com.mycompany.shoponline.Reponsitories.INhanVienRepository;
import com.mycompany.shoponline.utilities.HibernatUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class NhanVienRepository implements INhanVienRepository {

    @Override
    public List<NhanVien> getAll() {
        Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<NhanVien> list = (ArrayList<NhanVien>) session.createCriteria(NhanVien.class).list();
        System.out.println(list.size());
        return list;
    }

    @Override
    public boolean add(NhanVien nv) {
         Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(nv);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;  
    }

    @Override
    public boolean update(String id, NhanVien nv) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(id, nv);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public NhanVien getbymanv(String ma) {
        List<NhanVien>lisnv=getAll();
        for (NhanVien nhanVien : lisnv) {
            if(nhanVien.getMa().equals(ma)){
                return nhanVien;
            }
        }
        return null;
    }

}
