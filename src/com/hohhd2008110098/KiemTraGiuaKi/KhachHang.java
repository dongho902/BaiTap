package com.hohhd2008110098.KiemTraGiuaKi;

import java.util.spi.ResourceBundleControlProvider;

public class KhachHang extends Nguoi{
    private String tenCongty;
    private double giaTrihoaDon;

    KhachHang(){
    }

    public void setTenCongty(String tenCongty) {
        this.tenCongty = tenCongty;
    }
    public String getTenCongty() {
        return tenCongty;
    }

    public void setGiaTrihoaDon(double giaTrihoaDon) { 
        this.giaTrihoaDon = giaTrihoaDon;
    }
    public double getGiaTrihoaDon() {
        return giaTrihoaDon;
    }

    @Override
    public String toString() {
        System.out.println("Hóa đơn có Giá Trị : "+1000);
        return super.toString();

    }
    protected void xuat()
    {
        System.out.println("Tên CÔNG TY : "+tenCongty);
        System.out.println("Giá Trị Hóa đơn : "+giaTrihoaDon);
    }
    public String toString(){
        String s ; 
        s = "tên khách hàng : "+getHoTen()+"địa chỉ"+getDiaChi()+"tên công ty"+getTenCongty()+"hóa đơn"+getGiaTrihoaDon();
        Return s;
}
