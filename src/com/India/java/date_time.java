package com.India.java;

import java.util.Date;

public class date_time {
    //Printing_Date
    public static void main(String[] ars) {
        Date d1 = new Date();
        System.out.println(d1.toString());
        System.out.println(d1.getDay());
        System.out.println(d1.toInstant());
        System.out.println(d1.getTimezoneOffset());
        System.out.println(1900+ d1.getYear());
//please add 1900 to get correct year for month add 1
    }
}
