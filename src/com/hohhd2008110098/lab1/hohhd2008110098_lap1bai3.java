package com.hohhd2008110098.lab1;
import java.util.Scanner;

public class hohhd2008110098_lap1bai3 {
    public static void main(String[] args) {
        Float Canh, TheTich;
        System.out.println( "Nhap canh khoi lap phuonng : ");
        Scanner input = new Scanner(System.in);
        Canh = input.nextFloat();
        TheTich = Canh*Canh*Canh;
        System.out.println("The tich khoi lap phuong la : "+ TheTich );
    }
}
