package com.hohhd2008110098.Lab7;

import java.util.Scanner;

import com.hohhd2008110098.BaiTapVeNha.HinhTamGiac;
public class TestDriver {
public static void main(String[] args) {
    int LuaChon ;
    do{
        System.out.println(" 1. tam giac \n 2. hinh tron \n 3. Hinh Vuong \n 4. Amoeba \n thoat \n ");
        Scanner output = new Scanner(System.in);
        LuaChon = output.nextInt();
        switch(LuaChon ){
            case 1:
            TamGiac hinhTamGiac = new TamGiac();
            hinhTamGiac.getClass();
            System.out.println("Hinh tam giac duoc xoay ");
            break;
            case 2:
            HinhTron hinhtron1 = new HinhTron();
            hinhtron1.getClass();
            System.out.println("Hinh tron duoc xoay ");
            break;
            case 3:
            HinhVuong hinhVuong1 = new HinhVuong();
            hinhVuong1.getClass();
            System.out.println("Hinh vuong duoc xoay ");
            break;
            case 4:
            Amoeba amoeba1 = new Amoeba();
            amoeba1.getClass();
            System.out.println("Amoeba xoay :)))");
            break;
        default:
        break;
        }
        }while(LuaChon <= 4);
    }
}
