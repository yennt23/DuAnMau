/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.shoponline.Reponsitories;

import com.mycompany.shoponline.DomainModels.ChiTietSP;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public interface IChiTietSPRepository {
    public ArrayList<ChiTietSP> getlistform();
    public boolean xoa(String id);
    public boolean add(ChiTietSP ctsp);
    public boolean update(String id, ChiTietSP ctsp);
    public ChiTietSP getById(String id);
}
