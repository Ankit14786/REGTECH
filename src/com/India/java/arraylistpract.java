package com.India.java;

import java.util.ArrayList;
import java.util.Scanner;

/*
    *we use Array list where  we want adding  any yumberof elemnet a
    * we acana add mor e than size elemnt
    * capacity should be writetna naything we  can expand it o n a s per our need
    *Array list conatins Wrapper class for datq type Like Integer etc
    * we cant us e primitive type there as place of wtrapper classes
    * To get or print the elmemnts we have to use get(i) method her e instead of [i]
    *
    *     *
 */

/*
    *How internally Array list manage with sizes??
    * Size is fixed internally
    * Let say rraylist fills by some amount
    * It Will create a new array list of let say double the size not sure check
    * old eemnet ytaht arein old list copied into new array list
    * old list were deletedb
    * [1,2,3]==>[1,2,3,,,]
    * Just go with Array list code there you will find your need
    * >> is a right shift operator
    *
 */
public class arraylistpract {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> Ank=new ArrayList<Integer>(5);
//        Ank.add(32);
//        Ank.add(33);
//        Ank.add(35);
//        Ank.add(34);
//        Ank.add(31);
//        Ank.add(45);
//        Ank.add(39);
////
//        System.out.println(Ank);
//        System.out.println(Ank.contains(34));
//        System.out.println("Size:"+Ank.size());
//        System.out.println(Ank.set(0,78));
//        System.out.println(Ank.remove(2));
//        System.out.println(Ank);
        
        //We can itreate over array list as well
        //here we are taking input from USer
        System.out.println("Please enter the numbers :");
        for (int i = 0; i <7 ; i++) {
            Ank.add(sc.nextInt());
        }
        //herewe are printing
        for (int i = 0; i < 7; i++) {
            System.out.println(Ank.get(i));
        }

    }



}
