package com.hohhd2008110098.lab5;
import java.util.Scanner;

public class bookShelves {

    double giaBan;
    String nhaXuatBan;
    String tenSach;
    int namXuatban;
    int soLuong;
    String loaiSach;
    Scanner input = new Scanner(System.in);
    bookShelves(){
        
    }
    void nhapThongTinSach(){
        System.out.print("Nhập tên sách : ");
        tenSach = input.nextLine();
        System.out.print("Nhập thể loại sách  : ");
        loaiSach = input.nextLine();
        System.out.print("Nhập tên nhà xuất bản của sách : ");
        nhaXuatBan = input.nextLine();
        System.out.print("Nhập năm xuất bản  : ");
        namXuatban = input.nextInt();
        System.out.print("Nhập số lượng  : ");
        soLuong = input.nextInt();
        System.out.print("Nhập giá  :");
        giaBan = input.nextFloat();
    }
    void xuatThongTinSach(){
        System.out.println("Tên sách : " + tenSach);
        System.out.println("Loại sách : " + loaiSach);
        System.out.println("Tên nhà xuất bản  : " + nhaXuatBan);
        System.out.println("Năm xuất bản  : " + namXuatban);
        System.out.println("Số lượng : " + soLuong);
        System.out.println("Giá  :" + giaBan);
    }
    
}
