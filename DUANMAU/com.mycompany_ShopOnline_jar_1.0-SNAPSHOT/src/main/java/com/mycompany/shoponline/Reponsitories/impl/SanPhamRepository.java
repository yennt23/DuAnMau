/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.Reponsitories.impl;

import com.mycompany.shoponline.utilities.HibernatUtil;
import com.mycompany.shoponline.DomainModels.DongSP;
import com.mycompany.shoponline.DomainModels.NSX;
import com.mycompany.shoponline.DomainModels.SanPham;
import com.mycompany.shoponline.Reponsitories.ISanPhamRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author DELL
 */
public class SanPhamRepository implements ISanPhamRepository{

    @Override
    public List<SanPham> findAll() {
        Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<SanPham> list = (ArrayList<SanPham>) session.createCriteria(SanPham.class).list();
        return list;
    }
    
}
