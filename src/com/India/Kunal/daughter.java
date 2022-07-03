package com.India.Kunal;

public class daughter extends Parent_abstract{
    public daughter(int age) {
        super(age);//added  this to use the constructor of parent abstract class

    }

    @Override
    void Partner() {
        System.out.println("Hi I am daughter and my partner is dash");
    }

    @Override
    void career() {
        System.out.println("I have chooses a career in fashion designing");
    }
}
