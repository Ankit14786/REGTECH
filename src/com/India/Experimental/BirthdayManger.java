package com.India.Experimental;
import java.sql.*;
import java.util.*;

public class BirthdayManger {


        public static void main(String officials[]) {
            try {
                System.out.print('A');
                throw new RuntimeException("Out of bounds!");
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.print('B');
      //          throw t;
            } finally {
                System.out.print('C');
            }
    }
//        try {
//            int score = 1;
//            System.out.print(score++);
//        } catch (Throwable t) {
//            System.out.print(score++);
//        } finally {
//            System.out.print(score++);
//        }
//        System.out.print(score++);
//    }
}
//    public static void main(String[] args) {
//
//    }
//}
//
//class A{
//    private Date rob = new Date();
//    private java.util.Date sharon = new java.util.Date();
//}
