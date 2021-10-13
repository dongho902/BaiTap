package com.hohhd2008110098.Bankprojeck1;

public class customer {
    String TenKhachHang ;
    String DiaChiKhachHang;
    int soLuongKhachHang;
    Customer(){
       
    }
    void getName(){
        
            Scanner input = new Scanner(System.in);
            System.out.print(" Nhập tên khách hàng : ");
            TenKhachHang = input.nextLine();
        
    }
    void getAddress(){       
            Scanner input = new Scanner(System.in);
            System.out.print("Nhập địa chỉ khách hàng thứ  : ");
            DiaChiKhachHang = input.nextLine();
    }
    void printInformation(){      
            System.out.println("Tên khách hàng : " + TenKhachHang);
            System.out.println("Địa Chỉ : " + DiaChiKhachHang);
 }}

