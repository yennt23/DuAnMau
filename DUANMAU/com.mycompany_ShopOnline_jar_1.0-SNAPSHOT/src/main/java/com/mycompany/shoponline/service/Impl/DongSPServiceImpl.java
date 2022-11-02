/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.service.Impl;

import com.mycompany.shoponline.DomainModels.DongSP;
import com.mycompany.shoponline.Reponsitories.impl.DongSPRepository;
import com.mycompany.shoponline.Reponsitories.IDongSPRepository;
import com.mycompany.shoponline.service.DongSPService;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DongSPServiceImpl implements DongSPService{
private IDongSPRepository iDongSPRepository=new DongSPRepository();
    @Override
    public List<DongSP> getAllDongSP() {
    return iDongSPRepository.findAll();
    }
    
}
