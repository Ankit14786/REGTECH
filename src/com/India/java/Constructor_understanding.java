package com.India.java;

public class Constructor_understanding {

    public static void main(String[] args) {
        //Think like class name as type and we can declare an object like below too.
        Student ankit;
        ankit=new Student();
        //default constructor will initialize with default value, as we haven't pass any value.after initializing it add the values.
        System.out.println(ankit.name+ankit.roll_no +ankit.Marks);
//
//        ankit.roll_no=12;
//        ankit.Marks=88;
//        ankit.name="Shukla";
//        ankit.printer();

    //calling parameterised constructor or adding value to the variable s of obj :
        Student aman=new Student(23,"aman kushwaha",87);
        System.out.println("");
        System.out.println(aman.name+"**"+ aman.roll_no +"**"+aman.Marks);

        /*
        *Challenge is we cant write 1000 times ankit.rollno,ankit.something for 1000 objects so here we need
        * We need a way by which we can add refernce to the object (i.e.-"this" keyword inpython "self")
        * "this" keyword we refernce the instance variable with the values of construcor if you pass any
        * if you do not pass any value to the constructor it will initialize with default values

     */

     //Object creation for final concpt
     final A Ank=new A("Ankit Shukla");
        //You can only chnage in case of non primitive
      Ank.name="Shukla_Ankit";
      //When a non primitive type you cant assign
     // Ank= new A("Deepak");  //error shiuld be cant assign value to a final varible
    }

}
//Create For constructor Demo
class Student{
    int roll_no;
    String name;
    int Marks;

    void printer(){

        System.out.println("Your Name is :"+name+" And your Roll No is "+roll_no+" You got marks:"+Marks);
    }
    /*
      *default constructor either you create or it automatically created by java for cross check debug
     */
    Student (){
        this.name=name;
        this.Marks=Marks;
        this.roll_no=roll_no;
    }
/*
    *Below are the parameterized constructor which help you to initialize the variable associated with obj
    *
 */
    Student(int rno,String naam,int num){
        this.name=naam;
        this.Marks=num;
        this.roll_no=rno;
    }
}

//Created for final and memory free garbage collector concept undertanding
 /*
    -->Final keyword is used to make thing constant or immutable that we cant change
    -->we can only change value of final type variable if its of type reference Variable(i.e object type)
       .We cant change the value of primitive variable which are constant or final.
    -->for Primitive type variable ,we have to decalred name in "uppercase" and always have to intialize(add value) on that time
       Ex: final int INCREASE=2;
    -->we can only change the values of reference type final variable.We cant "reassign".
       Ex:-
        final Student s1=new Student();
        s1.name="ANkit SHUKLA"
        s1.name=other object   (not allowed reassigning)

  */

 class A {

    final int num=10;
    String name;

    A(String name){
        this.name=name;

    /*
        *finalize() method is called when java doing garbage collector operation
        * we cant free space manually but we can do something when memory will free.
        *
     */

    }
}
