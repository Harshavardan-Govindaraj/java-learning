package com.company;

import java.util.Scanner;

class bank{
    double deposit(double d){
        Scanner sc1=new Scanner(System.in);

        System.out.println("DEPOSIT\nENTER THE AMOUNT");
        int a= sc1.nextInt();
        System.out.println("Amount has been deposited");
       return d+a;
    }
    double withdraw(double d){
        Scanner sc=new Scanner(System.in);

        System.out.println("WITHDRAW\nENTER THE AMOUNT");
        int b= sc.nextInt();
        System.out.println("Amount has been withdrawn");
       return d-b;
    }

   private void update(){
        System.out.println("Balance has been updated");
    }

    void onlybank() {
        Scanner sc=new Scanner(System.in);

        System.out.println("IF YOU ARE A BANK EMPLOYEE ENTER YOUR ID OR PRESS ANY KEY TO EXIT");
        int str=sc.nextInt();
        if (str==123){
            update();}
        else {
            System.out.println("THANK YOU");
        }

    }

    public void balance(double d) {
        System.out.println("YOUR BALANCE IS:"+(d));
    }
}
public class Main {

    public static void main(String[] args) {
        double d=152637.00;
        System.out.println("YOUR BALANCE IS "+d);
        customer c = new customer();
      d=  c.deposit(d);
        d=c.withdraw(d);
        bank b = new bank();
        b.onlybank();
        b.balance(d);




    }}
     class customer extends bank {
}
