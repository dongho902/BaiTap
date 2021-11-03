package com.hohhd2008110098.Lab8;

public class SVKT extends SV{
    
    private double diemMarketing;
    private double diemSales;

    SinhVienKT(double diemMarketing, double diemSales){
        super();
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    @Override
    public double getDiem() {
        
        System.out.println("Điểm Sinh Viên KT : "+((2*diemMarketing)+diemSales)/3);
        return this.diemMarketing;
    }
    protected void xuatDiemSvKT(){
        System.out.println("Điểm Marketing : "+diemMarketing);
        System.out.println("Điểm Sales     : "+diemSales);
    }
    
}
