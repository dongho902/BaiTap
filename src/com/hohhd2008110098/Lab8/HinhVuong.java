package com.hohhd2008110098.Lab8;

import javax.xml.xpath.XPathEvaluationResult;

public class HinhVuong extends ChuNhat{
    
    private double canh;

    Vuong(){}

    protected void xuat(){
        System.out.println("độ dài của cạnh :"+getChieuDai());
        System.out.println("Chu vi của Hình Vuông là :"+(getChieuDai()*4));
        System.out.println("diện tích Hình Vuông là :"+(getChieuDai()*getChieuDai()));
        

    }



    
}
