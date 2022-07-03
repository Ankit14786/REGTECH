//Practice_All_With_Inheritence
package com.India.java;

public class Inherit {
    double l;
    double w;
    double h;

    Inherit(){
        this.l=-1;
        this.w=-1;
        this.h=-1;

    }
    //cube
    Inherit(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    Inherit(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;

    }
    //copy constructor concept
    Inherit(Inherit old){
        this.h=h;
        this.l=l;
        this.w=w;
    }

    void info_show(){
        System.out.println("Running the box");
    }
}



