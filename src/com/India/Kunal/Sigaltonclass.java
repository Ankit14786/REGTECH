package com.India.Kunal;

//Suppose if you wish that only one instance will be creted for your class than we need to use this type of thing.
//You should not allow anyone to use the constructor more than one.
public class Sigaltonclass {

    public static void main(String[] args) {
//    restriction obj =new restriction();//you cant because its a private constructor give you error

    //restriction obj;
    restriction obj1=restriction.getinstance();//says you nee to make func sttaic so do
    restriction obj2=restriction.getinstance();//says you nee to make func sttaic so do
    restriction obj3=restriction.getinstance();//says you nee to make func sttaic so do

    }
}

class restriction{
    private static restriction instance;
    private restriction(){

    }

    //Here we willc reate a function that gives you a singal objecy

    public static restriction getinstance(){
        //Check instance is created or not if not then do one time
        if (instance==null){
            instance=new restriction();
        }
        return instance;
    }
}
