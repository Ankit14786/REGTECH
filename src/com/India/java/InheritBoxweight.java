package com.India.java;

public class InheritBoxweight extends Inherit {
    double weight;

    public InheritBoxweight() {
        this.weight = -1;

    }

    public InheritBoxweight(double l, double h, double w, double weight) {
        super(l, h, w);//what is this? call the parent class constructor
        /*use to initialize values present  in parent class
        * it cant intialize the members taht are private
        * Private can be only access in same file.
        * if we mark l as private in Inherit class then super class in difeerent file cal initialize it because
        * inherit class initialize it not a child class

         */
    }
}
