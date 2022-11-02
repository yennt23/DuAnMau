/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.shoponline.Reponsitories;

import com.mycompany.shoponline.DomainModels.DongSP;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface IDongSPRepository {
    List<DongSP> findAll();
}
