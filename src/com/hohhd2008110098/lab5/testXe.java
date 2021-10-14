package com.hohhd2008110098.lab5;

public class testXe {
    public static void main(String[] args) {
        Sach sach = new Sach();
        sach.nhapThongTinSach();
        sach.xuatThongTinSach();
        System.out.println("==========================================================");
        nhanVien nhanVien1 = new nhanVien();
        nhanVien1.nhapThongTinNhanVien();
        nhanVien1.xuatThongTinNhanVien();
        System.out.println("==========================================================");
        car xeMoi = new car();
        xeMoi.inThongTinXe();
        System.out.println("==========================================================");
        MayTinh mayTinhMoi = new MayTinh("ACER", "Window","i5-10300H",2020,8,2021,19500000);
        mayTinhMoi.inThongTinMayTinh();
        System.out.println("==========================================================");
        account taiKhoanMoi = new account("Van", 121212, 50000);
        taiKhoanMoi.deposite(200000);
        taiKhoanMoi.Withdraw(20000);
        taiKhoanMoi.Show_Balance();
        System.out.println("==========================================================");
        ConCuu boCon = new ConCuu(2, 15);
        boCon.keu();
        boCon.an();
        System.out.println("==========================================================");
    }
    
    
}
