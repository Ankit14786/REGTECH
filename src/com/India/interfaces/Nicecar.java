package com.India.interfaces;

public class Nicecar {
    private InterfacesConcept engine;
    private Media Player=new cdplayer();
    public Nicecar() {
        engine=new powerengine();

    }

    public Nicecar(InterfacesConcept engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();


    }
    public void stop(){
        engine.stop();
    }

    public void Mymusic(){
        Player.start();
    }
    public void stopmusic(){
        Player.stop();
    }

    public void UpgradeEngine(){
        this.engine=new electricengine();
    }
}
