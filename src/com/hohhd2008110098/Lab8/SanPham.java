package com.hohhd2008110098.Lab8;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class SanPham {
private String tenSP;
private double DonGia;
private double ThueNhapKhau;
private double GiamGia;
public SanPham(){}

protected void xuat() {
    System.out.println("Xuất hóa đơn ");
    System.out.println("Tên sản phẩm "+ tenSP);
    System.out.println("giá trị của sản phẩm :"+DonGia+"VND");
    System.out.println("giảm giá :"+GiamGia+"VND");
    System.out.println("số tiền phải trả "+(DonGia-GiamGia)+"VND");
    
}
protected void Nhap(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập tên sản phẩm:");
    tenSP = sc.nextLine();
    System.out.println("Nhập giá trị của sản phẩm :");
    DonGia = sc.nextDouble();
    System.out.println("số tiền được giảm :");
    GiamGia = sc.nextDouble();

}
public SanPham(String tenSanpham , double donGia , double giamGia){
    this.DonGia = donGia;
    this.tenSP = tenSanpham;
    this.GiamGia = giamGia;

}
public SanPham(String tenSanpham , double donGia)
    {
        this(tenSanpham, donGia, 0);
    }
protected void getThueNhapKhau(){
    ThueNhapKhau = DonGia*(10/100);
    System.out.println("thuế nhập khẩu của sản phẩm là :"+ThueNhapKhau+"VND");
}
    
}
