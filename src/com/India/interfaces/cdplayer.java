package com.India.interfaces;

public class cdplayer implements Media{
    @Override
    public void start() {
        System.out.println("music start ");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");

    }
}
