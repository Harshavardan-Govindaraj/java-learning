package com.company;



 class privatebank implements bankRules{
    String name;
    privatebank( String str){
      this.name=str;
    }


 
     public void interest_paid() {

         System.out.println(this.name+" is paid an interest of 7%");
     }
 }
class governmentbank implements bankRules{
    String str;
    governmentbank( String str){
 this.str=str;
    }


    public void interest_paid() {
        System.out.println(this.str+" is paid an interest of 5%");

    }
}

public class Main {

    public static void main(String[] args) {
        String str="Charlie";
        privatebank pb=new privatebank(str);
        governmentbank gb=new governmentbank(str);
    pb.interest_paid();
    gb.interest_paid();

    }
}
interface bankRules{
    void interest_paid();

}
