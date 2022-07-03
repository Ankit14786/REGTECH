package com.India.java;

import java.util.Arrays;
import java.util.Scanner;
/*

 */
public class ArrayPract2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your rows and columns:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] Arr=new int[m][n];
        System.out.println("dekhna it will only print no of rows as a length of 2-d array" +Arr.length);
        for(int row=0;row<Arr.length;row++){
            //for each colun in every row
            //every array at that row select the length of that array
            for (int col=0;col<Arr[row].length;col++){
                System.out.println("Enter element for your 2-d array");
                Arr[row][col]=sc.nextInt();

            }

        }
      //Lo bhai Print bhi kr lo
        System.out.println("Printing your Array that you have input from consle");
        for (int row=0;row<Arr.length;row++) {

            for (int col = 0; col < Arr[row].length; col++) {
                System.out.print(Arr[row][col]+" ");
            }
            System.out.println();

        }

        //dusri trh sew kr lo esily
        for (int i = 0; i <Arr.length ; i++) {
            System.out.println(Arrays.toString(Arr[i]));
            Arrays.sort(Arr);
            System.out.println();
        }

        /*
        *printing with the help of for each
        * here we need to define a ttype
        * think whats type of array 2d its int but for iterating over 2-d array
        * we need to define a type in for loop
        * every element of 2-d array is itself a array so
        * for for each loop type will be Array
        * To itereate over 2-d array we need to define type  as array but jt should be 1-d why?
        * because in 2-d array is a  combination of 1 d arrays .
        *
                */
        System.out.println("Here we are printing with for each loop");
        for(int[] a :Arr){
            System.out.println(Arrays.toString(a));
        }

    }


}
