package com.India.Kunal;

public class ObjclassConcept {
    int num;

    public ObjclassConcept(int num) {
        this.num = num;
    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    @Override
    public String toString() {
        return super.toString();
    }
    //It basically gives a number representation of object.
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ObjclassConcept() {
        super();
    }

    public static void main(String[] args) {
        ObjclassConcept ob1=new ObjclassConcept(34);
        System.out.println("Printing hashcosde or number representation of object"+ob1.hashCode());
    }
}

