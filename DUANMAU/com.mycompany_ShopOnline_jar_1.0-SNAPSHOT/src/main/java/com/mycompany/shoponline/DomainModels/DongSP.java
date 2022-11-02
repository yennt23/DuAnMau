/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoponline.DomainModels;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "DongSP")
public class DongSP {

    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2", parameters = {})
   
    @GeneratedValue(generator = "generator")
    @Column(columnDefinition = "uniqueidentifier")
    private String id;

    public List<ChiTietSP> getChiTietSP() {
        return chiTietSP;
    }

    public void setChiTietSP(List<ChiTietSP> chiTietSP) {
        this.chiTietSP = chiTietSP;
    }
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    private String ten;
    @OneToMany(mappedBy = "dongSP")
    private List<ChiTietSP>chiTietSP;
    public DongSP() {
    }

    public DongSP(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return ten;
    }
    
}
