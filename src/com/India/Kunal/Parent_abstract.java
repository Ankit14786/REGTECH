package com.India.Kunal;

/*
    *abstract classess are used to determine the function which have no body
    * But we can inherit it and define our own body.
    * The class which contains abstract methods should be abstract
    * we cant create a n object of anstct class because their methods have no body
    * The sub class of abstract class should have all the methods used that are in abstract class/.
    *You cant make abstrct method and class as static but you can use static method there
    * IF you put final keyword with class then it will not inherited .You can call final varible in another construcor
    * ie, we a super methods.
    * You can also create a normal methods.
    * abstract classes cant support multiple inheritence.
 */
public abstract class Parent_abstract {
    int age;
//we can also create a constructor of abstrct class it allows us to do but it can only be accessible with super
    public Parent_abstract(int age) {
        this.age = age;
    }

    abstract void career();
    abstract void Partner();


}

