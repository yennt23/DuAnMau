/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.service.Impl;

import com.mycompany.shoponline.DomainModels.NSX;
import com.mycompany.shoponline.Reponsitories.INSXRepository;
import com.mycompany.shoponline.Reponsitories.impl.NSXRepository;
import com.mycompany.shoponline.service.NSXService;
import java.util.List;

/**
 *
 * @author DELL
 */
public class NSXServiceImpl implements NSXService{
    private INSXRepository insxr=new NSXRepository();

    @Override
    public List<NSX> getAllNSX() {
      return insxr.findAll();
    }
}
