package com.India.Generics;

import java.awt.*;
import java.util.ArrayList;

/*
    *generics are used to make things reliable like not specifying the type
    * we can create our own custom array list which are  not fixed with type
    * it can store any type of data
    * for this we use concept of generics seems like making things general
    * we use All Capital letters for Defining TYpe;
    * It can be any thing like ,T,TYPE,TY etc
    * Generics need not be restricted just for Type,you can even create generics with methods as well
    *  only
 */

public class CustomArraylist {
    //NOTE:- We can Run program withod Main Mwthod my static Block It always run before main()

    //we can use generics with function slike this:-
    static <X> X doubleValue(X value){
        return value;
    }

    //Benefit is we can extend here also suppost we wanna use methods of List class which is pre defined so
    //i.e. anything whic is implemnted on List we can use here
 //   static <X extends List>

    public static void main(String[] args) {

       String value1=doubleValue(new String());
       Integer number= doubleValue(Integer.valueOf(6));
       ArrayList list=doubleValue(new ArrayList<>());


        //we can define type here also what about genral form ??
        //


        customlist<String> list1=new customlist();
        list1.addElement("AnkitEle1");
        list1.addElement("AnkitEle2");
        System.out.println(list1);
        String value=list1.get(0);

        customlist<Integer> list2=new customlist();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(34));
        System.out.println(list2);
        Integer Number =list2.get(0);
    }

}
//To make genric marke type at class  and replace everywhere inside by T where you used any type
class customlist<T>{

    ArrayList<T> list = new ArrayList<>();
    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    public String toString(){
      return   list.toString();
    }
    //used for get
    public T get (int index){
        return list.get(index);
    }
}

//
////To Apply Restriction on types:-
////Byte,Double,Integer,Float,Long,Short are all subclasses of Number
////Advantage of Restrictions is now we can add all the methods of Number class
//public class CustomArraylist {
//    public static void main(String[] args) {
//        //we can define type here also what about genral form ??
//        //
//        customlist<Long> list1=new customlist();
//        list1.addElement(67l);
//        list1.addElement(34l);
//        System.out.println(list1);
//        Long value=list1.get(0);
//
//        customlist<Integer> list2=new customlist();
//        list2.addElement(Integer.valueOf(5));
//        list2.addElement(Integer.valueOf(34));
//        System.out.println(list2);
//        Integer Number =list2.get(0);
//    }
//
//}
////To make genric marke type at class  and replace everywhere inside by T where you used any type
////Now its restricted to take string here because we have extended Number class which is parent class of Integer and sub class of  Object
//class customlist<T extends Number>{
//
//    ArrayList<T> list = new ArrayList<>();
//    public void addElement(T element){
//        list.add(element);
//    }
//
//    public void removeElement(T element){
//        list.remove(element);
//    }
//
//    public String toString(){
//        return   list.toString();
//    }
//    //used for get
//    public T get (int index){
//        return list.get(index);
//    }
//}
