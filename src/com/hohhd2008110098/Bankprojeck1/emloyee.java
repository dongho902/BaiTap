package com.hohhd2008110098.Bankprojeck1;

public class emloyee {
    String Name;
    float Salary;
    int soLuongNhanVien ;
    Emloyee(){
        
    }
    void getName(){        
            System.out.print("Nhập tên của nhân viên : ");
            Scanner input = new Scanner(System.in);
            Name = input.nextLine(); 
    }
    void getSalary(){
            System.out.print("Nhập lương của nhân viên : ");
            Scanner input = new Scanner(System.in);
            Salary = input.nextFloat();
        
    }
    void printInfomationEmployee(){
       
            System.out.println("Tên nhân viên là : " + Name);
            System.out.println("Lương nhân viên là : " + Salary);
    }
    
}
