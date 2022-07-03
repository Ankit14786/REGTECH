package com.India.interfaces;

public class car implements InterfacesConcept,Media,Brake{
    @Override
    public void brake() {
        System.out.println("Breake Lgao car me");
    }

    @Override
    public void start() {
        System.out.println("start kro car ko");
    }

    @Override
    public void stop() {
        System.out.println("Band kro car");
    }

    @Override
    public void acc() {
        System.out.println("Bhagao car");
    }
}
