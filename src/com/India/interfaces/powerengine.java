package com.India.interfaces;

public class powerengine implements InterfacesConcept{

    @Override
    public void start() {
        System.out.println("PowerEngine strt");
    }

    @Override
    public void stop() {
        System.out.println("Powerengine stop");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerated");
    }

    @Override
    public void brake() {

    }
}
