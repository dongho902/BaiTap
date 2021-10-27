package com.hohhd2008110098.BaiTapVeNha;

public class HinhTron {
    String amThanh = "nhạc ";
    boolean click =  true ;
    void  turn () {
        System.out.println("xoay 360 ");
        click =  true ;
    }
void  playMusic () {
    if (click ==  true ) {
       System.out.println("Âm nhạc được phát "+ amThanh);

    }
    else
    System.out.println("lỗi phát nhạc vui lòng thử lại ");
    
}}
