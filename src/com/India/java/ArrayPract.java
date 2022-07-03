package com.India.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPract {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //we cant create array without declaring  size.
        int[] arr=new int [5];
//        arr[0]=12;
//        arr[1]=53;
//        arr[2]=24;
//        arr[3]=21;
//        arr[4]=34;
        System.out.println(arr[3]);
    //take input from user
        for (int i=0;i<arr.length;i++){
            System.out.println("Please Enter the number:");
            arr[i]=in.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.print("Array:"+arr[i]+"");
        }

        //for each loop
        for (int num:arr)
            System.out.println("Printed by for each "+num+" ");

        //with to string concept
        System.out.println("Printed by to string method"+Arrays.toString(arr));
    }

    //2-d Array concept

    //int Arr[][]=new int[][];
 //   int[][] Arr1={{12,45,7},
   //         {2,45},
     //       {23,56,87}//Arr1[2]={23,56,87}
            //Arr1[2][0]=23
       //     };

    //trying t take input for 2-d array:

    /*
    * array size of column may be vary then how can you deal with it?
    * You can highlight length of particular rows and that can help in getting number of column
    *
     */
 //       Scanner s2d=new Scanner(System.in);
   //     int [][]Arr2=new int[m][n];




}
