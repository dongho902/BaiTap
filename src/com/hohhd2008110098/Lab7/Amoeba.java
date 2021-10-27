package com.hohhd2008110098.Lab7;

public class Amoeba {String sound;

    int x;
    int y;

    Amoeba(){}        
    
    public Amoeba(String s){
        sound = s;
    }
    public Amoeba(String s, int xx, int yy){
        sound = s;
        x = xx;
        y = yy;
    }
    void rotate(){


        System.out.println("xoay theo tọa độ x và y");
        System.out.println("x = "+x +" y = "+y);
    }
    void playSound(){
        System.out.println("phát ra file âm thanh có tên "+sound);
    }
    
}
