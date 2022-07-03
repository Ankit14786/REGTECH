package com.India.interfaces;

public class electricengine implements InterfacesConcept{
    @Override
    public void start() {
        System.out.println("Electric strt");
    }

    @Override
    public void stop() {
        System.out.println("electric stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric acccerated");
    }

    @Override
    public void brake() {

    }
}
