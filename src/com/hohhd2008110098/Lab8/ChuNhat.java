package com.hohhd2008110098.Lab8;

import java.util.Scanner;
public class ChuNhat {
    private double ChieuDai;
    private double ChieuRong;
    

    ChuNhat(){}
    public double getChieuDai(){
        return ChieuDai;

    }
    public void setChieuDai(){
        this.ChieuDai = ChieuDai;

    }
    public double getChieuRong(){
        return ChieuDai;

    }
    public double setChieuRong(){
        this.ChieuRong = ChieuRong;

    }
    private double getDienTich;
    private double getChuVi;

    protected void xuat() {
        System.out.println("Chieu Dai"+ChieuDai);
        System.out.println("Chieu Rong"+ChieuRong);
        System.out.println("chu vi :"+(getChieuDai()+getChieuRong())*2);
        System.out.println("Dien Tich"(getChieuDai()*getChieuRong()));

        
    }
}
