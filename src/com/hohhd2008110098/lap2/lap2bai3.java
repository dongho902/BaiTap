package com.hohhd2008110098.lap2;

import java.util.Scanner;

public class lap2bai3 {
    public static void main(String[] args) {
        float soDien;
        double soTien;
        System.out.println("tổng số điện sử dụng trong tháng là : ");
        Scanner bien = new Scanner(System.in);
        soDien = bien.nextFloat();
        if(soDien <= 50){
        soTien = soDien*1000;
        System.out.println("vậy tổng số tiền điện tháng này là : " +soTien);
        }
        else{
            soTien = 50*1000 + (soDien - 50)*1200 ;
            System.out.println("Vậy tổng số tiền điện tháng này là "+soTien);
            }
        }
}
