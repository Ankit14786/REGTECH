package com.India.java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class shopping_cart {

    public static void main(String[] args) {
       shopping_cart t1=new shopping_cart();
        t1.login();
    }
    public void login( ){
        String cust_name;
        int cust_phone;
        String cust_type;
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter foollowing details:-");
        System.out.println("Please enter name:"+(cust_name=sc.next()));
        System.out.println("Please enter phone:"+(cust_phone=sc.nextInt()));
        System.out.println("Please enter work_type:"+(cust_type=sc.nextLine()));

        System.out.println("===========Submitted==Suucess_==Login====");
        System.out.printf("===========::Your details::====\n "+"%d %c %d"+cust_name+cust_phone+cust_type);



    }
}


