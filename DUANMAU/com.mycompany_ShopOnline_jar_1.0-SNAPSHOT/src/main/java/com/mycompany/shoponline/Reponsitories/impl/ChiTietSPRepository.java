/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.Reponsitories.impl;

import com.mycompany.shoponline.utilities.HibernatUtil;
import com.mycompany.shoponline.DomainModels.ChiTietSP;
import com.mycompany.shoponline.DomainModels.SanPham;
import com.mycompany.shoponline.Reponsitories.IChiTietSPRepository;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL
 */
public class ChiTietSPRepository implements IChiTietSPRepository {

    public ArrayList<ChiTietSP> getlistform() {
        Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<ChiTietSP> list = (ArrayList<ChiTietSP>) session.createCriteria(ChiTietSP.class).list();

        return list;
    }

    public boolean xoa(String id) {
        ChiTietSP ctsp = new ChiTietSP();
        ctsp.setId(id);
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(ctsp);
            transaction.commit();
            return true;
        } catch (Exception e) {
        }

        return false;
    }

    public boolean add(ChiTietSP ctsp) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(ctsp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ChiTietSP getById(String id) {
        Session session = HibernatUtil.getFACTORY().openSession();
        ChiTietSP ctsp =  (ChiTietSP) session.get(ChiTietSP.class, id);
        return ctsp;
    }
    
    public boolean update( String id,ChiTietSP ctsp) {
        Transaction transaction = null;
        try (Session session = HibernatUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(id, ctsp);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
