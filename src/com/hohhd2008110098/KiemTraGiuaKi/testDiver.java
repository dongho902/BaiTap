package com.hohhd2008110098.KiemTraGiuaKi;


public class testDiver {
    public static void main(String[] args) {
        Nguoi nguoi = new Nguoi();
        nguoi.setHoTen("nguyen van A");
        nguoi.setDiaChi("190 Lũy bán bích");
        nguoi.xuat();
        System.out.println("---------------------");
        HocVien hocVien = new HocVien();
        hocVien.setDiemMonhoc1(7);
        hocVien.setDiemMonhoc2(8);
        hocVien.setSoLuongHv(150);
        hocVien.xuat();
        System.out.println("---------------------------");
        NhanVien nv = new NhanVien();
        nv.setHeSoluong(4);
        nv.xuat();
        System.out.println("------------------------");
        KhachHang khachhang = new KhachHang();
        khachhang.setTenCongty("Nguyen thi B");
        khachhang.setDiaChi("190 lũy bán bích");
        khachhang.xuat();
    }
    
}
