package com.hohhd2008110098.Lab8;

public class TestBanHang {


    public static void main(String[] args) {
        SanPham sanPham = new SanPham();
        sanPham.Nhap();
        sanPham.getThueNhapKhau();
        SanPham sanPham2 = new SanPham();
        sanPham2.Nhap();
        sanPham2.getThueNhapKhau();
        sanPham.xuat();
        sanPham2.xuat();

        SanPham SP1 = new SanPham("quần tây", 500000,50000);
        SanPham SP2 = new SanPham("áo sơ mi", 700000,70000);

        SP1.xuat();
        SP2.xuat();
        

    }
    
}
