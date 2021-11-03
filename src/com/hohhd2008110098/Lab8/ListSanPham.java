package com.hohhd2008110098.Lab8;

import java.util.ArrayList;
import java.util.Scanner;
import com.hohhd2008110098.Lab8.SanPham;
public class ListSanPham {
    static ArrayList<SanPham> danhsachSP = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void nhapDanhSach()
    {
        SanPham sanpham = new SanPham();
        sanpham.nhap();
        sc.nextLine();
        danhsachSP.add(sanpham);
        System.out.println(sanpham);
    }
}
