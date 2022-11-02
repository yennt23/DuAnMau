/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.Reponsitories.impl;

import com.mycompany.shoponline.utilities.HibernatUtil;
import com.mycompany.shoponline.DomainModels.ChiTietSP;
import com.mycompany.shoponline.DomainModels.DongSP;
import com.mycompany.shoponline.DomainModels.MauSac;
import com.mycompany.shoponline.Reponsitories.IMauSacRepository;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.hibernate.Session;

/**
 *
 * @author DELL
 */
public class MauSacRepository implements IMauSacRepository{

    @Override
    public List<MauSac> findAll() {
        Session session = HibernatUtil.getFACTORY().openSession();
        ArrayList<MauSac> list = (ArrayList<MauSac>) session.createCriteria(MauSac.class).list();
        return list;
    }
    
}
