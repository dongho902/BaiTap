package com.hohhd2008110098.lab5;

public class account {
    int accout_number ;
    int accout_balance ;
    String name_customer;
    account(String t,int a , int b){
        accout_number = a;
        accout_balance = b;
        name_customer = t;
    }
    public void Show_Balance() {
        System.out.println("accout_number = " + accout_number);
        System.out.println("accout_balance = " + accout_balance);
    }
    public void deposite(int ammout){
        if(ammout > 0){
            accout_balance += ammout;
        }
        else System.out.println("Số tiền đã nhập không hợp lệ !!!");
    }
    public void Withdraw(int ammout){
        if(ammout < accout_balance && ammout > 0){
            accout_balance -= ammout;
        }
        else System.out.println("Số tiền đã nhập không hợp lệ !!!");
    }
}
