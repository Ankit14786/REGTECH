package com.India.java;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.lang.System;

public class Multiplicaiontable {
    Scanner s1=new Scanner(System.in);

    void printtable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d=%d",number,i,number*i).println();
        }
    }
}

class MyOverloaded{
    public static void main(String[] args){
 /*       Multiplicaiontable t1=new Multiplicaiontable();
        t1.printtable(5);
        System.out.println(t1);
   */
        Array_list p1=new Array_list();
        int inex=p1.callMe();
        System.out.println("Your Array List"+inex);


    }
}

class Array_list{
    public  int callMe(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(23);
        list.add(33);
    //    list.remove(3);
        System.out.println("Your Array list look like " + list);
        int element=list.get(1);
        int index=list.get(1);
        System.out.println("Printing first elemnt:"+element);
        list.add(2,3);
        System.out.println("Your Array list look like After Upadte " + list);

        for (int i =0;i<list.size();i++){
            System.out.printf(" "+list.get(i)).println();

        }

        //sorting
        Collections.sort(list);
        System.out.println("Your sorted list"+list);
        return index;
    }
}