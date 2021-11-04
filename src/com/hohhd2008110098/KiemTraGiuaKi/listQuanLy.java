package com.hohhd2008110098.KiemTraGiuaKi;

import java.util.ArrayList;

public class listQuanLy {
    private ArrayList<Nguoi> danhSach = new ArrayList<Nguoi>();
    public void them(Nguoi nguoi){
        this.danhSach.add(nguoi);
    }
    public void inDanhSach(){
        System.out.println(danhSach);
    }
    
}
