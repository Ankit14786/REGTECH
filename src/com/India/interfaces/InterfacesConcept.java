package com.India.interfaces;

/*
 *Interfaces basically contains abstract functions.Its like abstract class by default the functions are public and abstrct in interface and
 * Variables are static and final by default in interfaces.
 * What's classes doing ?not How classes doing?
 * difference between class and interfaces is class contains state and behaviour but interface cant.
 * We can't inherit more ethan one classes but we can inherit more than one interfaces.
 * All Variables are final.Interface can't have constructor ten How you can initialize them? that a reason why we use
 * Final variables.
 * abstract class can provide implementation of interface but interface cant provide a implementation of abstrct class
 * Here we use "implements" keyword
 * all methods should be abstracte
 * interface keyword is used to declare an interface
 * interface-->interface use"extends
 * clsas-->interface use "implements"

 */

public interface InterfacesConcept {
    static final int PRICE=12345;
    void start();
    void stop();
    void acc();

    void brake();
}



