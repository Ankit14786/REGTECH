package com.India.Experimental;

class MyBaseClass {
    public MyBaseClass() {
        System.out.print("B");
    } //from w  w  w .  j av  a2  s  .c  o m
}
public class MyClass extends MyBaseClass {
    public MyClass(String s) {
        super();
        System.out.print("D");
    }
    public static void main(String [] args) {
        new MyClass("C");
        System.out.println(" ");
    }
}