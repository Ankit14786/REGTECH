package com.India.java;

public class Ank
{
    public static void main(String []args){
        System.out.println("Be Greatful");
        System.out.println("args-count:"+args.length);

        for (int i=0;i<args.length;i++){
            System.out.println("args[" +i+ "]"+args[i]);
        }
        Multiplicaiontable table=new Multiplicaiontable();
        table.printtable(6);

    }
}
