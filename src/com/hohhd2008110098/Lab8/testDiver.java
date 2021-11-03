package com.hohhd2008110098.Lab8;

public class testDiver {
    public static void main(String[] args) {
        ChuNhat chuNhat = new ChuNhat();
        chuNhat.setChieuDai(8);
        chuNhat.setChieuRong(7);
        chuNhat.xuat();
        

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.setChieuDai(8);
        hinhVuong.xuat();


        SV sv = new SV();
        sv.setHoTen("PhamHuynhNhu");
        sv.setNganh("CNTT");
        sv.setDiem(7);
        sv.xuat();



        SVCNNT svcnnt = new SVCNNT("PhamHuynhNhu","CNTT",8, 9 ,10, 10);
        svcnnt.xuatDiemSvIT();
        svcnnt.getDiem();

        

        SVKT svkt = new SVKT( 9,10);
        svkt.xuatDiemSvKT();
        svkt.getDiem();
        



    }
    
}
