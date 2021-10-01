package com.hohhd2008110098;
import java.util.Scanner;
public class lap3 {
    public static void main(String[] args) {
        System.out.println("nhập một số bất kì");
        Scanner bien = new Scanner(System.in);
        int n = bien.nextInt();
        if(soNguyenTo(n)){
            System.out.println("là số nguyên tố " + n);

        } else {
            System.out.println("không phải là số nguyên tố" + n);
        }

    }
    public static boolean soNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for(int i=2; i < n-1; i++){
            if (n % i == 0){
                return false;
            }
           
        }
        return true;

    }
    
}
