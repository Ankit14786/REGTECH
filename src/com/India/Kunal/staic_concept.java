package com.India.Kunal;

import com.sun.tools.javac.Main;

public class staic_concept {

    public static void main(String[] args) {
        Emp Navin=new Emp();
        Navin.eid=12;
        Navin.salary=25000;
        Navin.show();

        Emp Rahul=new Emp();
        Rahul.show();

    }





    public void greeting() {
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    *Static variables are same for all te objects
    * non static variables are different for all the objects .
    * Cant use Non static variable inside static block
    * Ex:- try to access variable declared up of main() and try to access it in main: not allowed until it static
    *In side static method you cnat access non-static method or data means you just need to reference it with object.
    * remember you can call static varibale with the help of object too but always use class name.
    * We know that something which are not static belongs to an object.
 */
class Emp{

    int eid;
    int salary;
    static String CEO; //it ill ot going into heap memory it will go into clas loader of JVM

    static {            //When you load a  class and class will loaded once
            CEO="Ankit";
            System.out.println("In static");

    }
    public Emp(){ //when you create an object than initialize
        eid=1;
        salary=20000;
        System.out.println("In Constructor");
    }

    public void show(){
        System.out.println(eid+":"+salary+":"+CEO);
    }
    static  void fun(){
        System.out.println("Fun Check for static function accessability");
 //       greeting();//You cant use this because It requires an instance but the function you are using it
                   //in doesnot depend on instances.
        //You cannot access non static stuff without refernceing their instances to a static context.

        //henmce,here I am referncing it
        staic_concept obj=new staic_concept();
        obj.greeting();

    }

    void greeting(){
        //fun();
        System.out.println("Hii ,Non Static Hu mai");
    }
}
