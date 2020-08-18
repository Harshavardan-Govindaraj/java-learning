package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        example num=new example();
        Scanner sc=new Scanner(System.in) ;
       System.out.println("Enter a number");
        double a= sc.nextInt();
	    System.out.println("Enter a number");
        double b= sc.nextInt();
        num.values(a,b);
        System.out.println("Choices\n 1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.EXIT");
        int c= sc.nextInt();
        if (c!=5){
       switch (c) {
            case 1 -> num.addition();
            case 2 -> num.subtraction();
            case 3 -> num.multiplication();
            case 4 -> num.division();
            default -> System.out.println("wrong choice .give a correct choice");
        }}
        else{
            System.out.println("THANK YOU");
        }

}}
