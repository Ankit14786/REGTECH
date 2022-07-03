package com.India.java;

public class main {
    public static void main(String[] args) {
    Inherit box=new Inherit(4);
    //which constructor is there to take the type of object box there is a copy constructor.
    Inherit box2=new Inherit(box);
    InheritBoxweight box3=new InheritBoxweight();
    InheritBoxweight box4=new InheritBoxweight(2.0,3.0,5.8,8.6);

    System.out.println("The length of box is:"+box.l+" and width is:"+box.w+" height is:"+box.h);
    System.out.println("The length of box is:"+box3.h+" and weight is:"+box3.weight+" height is:"+box3.h);
    }
}
