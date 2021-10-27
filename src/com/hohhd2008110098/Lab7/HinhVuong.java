package com.hohhd2008110098.Lab7;

public class HinhVuong {
    String AmThanh = "Am nhac duoc bat";
    boolean click = true;

    void Xoay360() {

        System.out.println("Xoay 360 do");
        click = true;


    }
    void AmNhac(){
        if( click == true){
            System.out.println("Am Nhac phat ra "+ AmThanh);
        }
        else
            System.out.println("Am Nhac chua duoc bat ");
        
    }
    
}
