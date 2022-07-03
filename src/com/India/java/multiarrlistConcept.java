package com.India.java;

import java.util.ArrayList;
import java.util.Scanner;

public class multiarrlistConcept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
      //Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //Adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println("Here is your list:"+list);
    }
}
