package com.company;


public class example {
    private double i;
private double j;
    public example(){
        System.out.println("CALCULATION");
    }
    public void addition() {
         System.out.println("Answer is"+(i+j));
    }

    public void subtraction() {
        System.out.println("Answer is"+(i-j));
    }

    public void multiplication() {
        System.out.println("Answer is"+(i*j));
    }

    public void division() {
        System.out.println("Answer is"+(i/j));
    }



    public void values(double a, double b) {
        i=a;
        j=b;

    }
}
