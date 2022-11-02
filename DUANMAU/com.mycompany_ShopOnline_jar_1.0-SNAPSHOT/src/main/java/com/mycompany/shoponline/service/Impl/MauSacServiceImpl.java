/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.service.Impl;

import com.mycompany.shoponline.DomainModels.MauSac;
import com.mycompany.shoponline.Reponsitories.IMauSacRepository;
import com.mycompany.shoponline.Reponsitories.impl.MauSacRepository;
import com.mycompany.shoponline.service.IMauSacService;
import java.util.List;

/**
 *
 * @author DELL
 */
public class MauSacServiceImpl implements IMauSacService {

    private IMauSacRepository iMauSacRepository = new MauSacRepository();

    @Override
    public List<MauSac> getAllMauSac() {
        return iMauSacRepository.findAll();
    }
}
