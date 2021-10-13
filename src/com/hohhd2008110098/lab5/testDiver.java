package com.hohhd2008110098.lab5;

public class testDiver {
    public static void main(String[] args) {
        book sach = new book();
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
        computer mayTinhMoi = new computer("ACER", "Window","i5-10300H",2020,8,2021,19500000);
        mayTinhMoi.inThongTinMayTinh();
        System.out.println("==========================================================");
        account taiKhoanMoi = new account("Van", 121212, 50000);
        taiKhoanMoi.deposite(200000);
        taiKhoanMoi.Withdraw(20000);
        taiKhoanMoi.Show_Balance();
        System.out.println("==========================================================");
        cow boCon = new cow(2, 15);
        boCon.keu();
        boCon.an();
        System.out.println("==========================================================");
    }
    
    
}
