/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.shoponline.service;

import com.mycompany.shoponline.DomainModels.ChiTietSP;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface ChiTietSPService {

    public ArrayList<ChiTietSP> getlist();

    public boolean xoa(String id);

    public boolean add(ChiTietSP sp);

    public ChiTietSP getById(String id);

    public boolean update(String id, ChiTietSP sp);
}
