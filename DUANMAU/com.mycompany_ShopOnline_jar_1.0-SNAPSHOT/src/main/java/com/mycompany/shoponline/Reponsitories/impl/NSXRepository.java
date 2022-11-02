/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.Reponsitories.impl;

import com.mycompany.shoponline.utilities.HibernatUtil;
import com.mycompany.shoponline.DomainModels.ChiTietSP;
import com.mycompany.shoponline.DomainModels.MauSac;
import com.mycompany.shoponline.DomainModels.NSX;
import com.mycompany.shoponline.Reponsitories.INSXRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author DELL
 */
public class NSXRepository implements INSXRepository{

    @Override
    public List<NSX> findAll() {
        Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<NSX> list = (ArrayList<NSX>) session.createCriteria(NSX.class).list();
        return list;
    }
    
}
