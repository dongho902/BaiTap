package com.hohhd2008110098.lab1;

import java.util.Scanner;

public class hohhd2008110098_lap1 {
    public static void main(String[] args) {
        Float ChieuDai, chieuRong, DienTich, ChuVi, CanhNhoNhat;
        System.out.println("nhap chieu dai va chieu rong cua hinh chu nhat :");
        java.util.Scanner input = new Scanner(System.in);
        ChieuDai = input.nextFloat();
        chieuRong = input.nextFloat();
        ChuVi = (ChieuDai + chieuRong)*2;
        DienTich = ChieuDai*chieuRong;
        CanhNhoNhat = Math.min(ChieuDai, chieuRong);
        System.out.println("Dien tich hinh chu nhat la : "+ DienTich +"\n chu vi hinh chu nhat la : "+ ChuVi +"\n Canh nho nhat la : "+ CanhNhoNhat);


    }
}
