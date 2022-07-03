package com.India.java;
import java.io.*;
import java.util.Collections;
import java.util.Scanner;


public class File_Handling {
    public static void main(String[] any) throws IOException {
      //Code to Create a New File
        File f1 = new File("C:/Users/ANKIT_ATYETI/Desktop/ankit/File-handle1.txt");
        boolean status;

        {
            try {
                status = f1.createNewFile();
                System.out.println(status);
            } catch (IOException e) {
                System.out.println("Nhi Kr skta Create Bhai !!");
                e.printStackTrace();
            }
        }
        //get information about file.

        if (f1.exists()){
            System.out.println("File name:"+f1.getName());
            System.out.println("File path:"+f1.getAbsolutePath());
            System.out.println("File path:"+f1.getParent());
            System.out.println("writable:"+f1.canWrite());
            System.out.println("writable:"+f1.canRead());
            System.out.println("writable:"+f1.exists());
            System.out.println("exe or not :"+f1.canExecute());
            System.out.println("diffpath:"+f1.getPath());
            System.out.println("isfile:"+f1.isFile());
            System.out.println("isfile:"+f1.lastModified());
            System.out.println("isfile:"+f1.length());

        }
        else{
            System.out.println("File hi nahi hai");
        }
        //Write to a file

        FileWriter fw=new FileWriter("C:/Users/ANKIT_ATYETI/Desktop/ankit/File-handle1.txt");
        fw.write("Hi Ankit You re Doing Great ,God bless you"+12+12.56);
        String z=fw.getEncoding();
        System.out.println("your getencoding"+z);
        fw.close();
        System.out.println("Likh gya bhai");

        //Read from a file
        //here we pass a file object f1 because it contains a file now scanner obj will read it and close it after read.
        Scanner sc=new Scanner(f1);
        while(sc.hasNextLine()){
            System.out.println("Raed kiya hua hai"+sc.nextLine());
        }
        sc.close();

        /*Streams concept for handling files :
        *having byte and char stream
        * for string we use char
        * not good way  you can go with Buffered Reader or Scaneer wala method
         */
        //treying to write with output stream
        int i;
        FileOutputStream fout=new
                FileOutputStream("C:/Users/ANKIT_ATYETI/Desktop/ankit/File-handle1.txt");
        String s="ankitFileoutputstream se kiya hai ye ";
        char[] ch=s.toCharArray();
        for (i=0;i<s.length();i++){
            fout.write(ch[i]);

        }
        fout.close();

        //Reading with INputsteeam
        FileInputStream fin;
        fin=new FileInputStream("C:/Users/ANKIT_ATYETI/Desktop/ankit/File-handle1.txt");

        do {
            i = fin.read();
        //java dont have any EOF charcter so we can check with values
            if (i != -1)
                System.out.print((char) i);

        }
        while (i != -1) ;
        fin.close();



        //Code  To Write in a File

    }
}

//
// class File_andling {
//
//    public static void main(String[] args) {
//        File file = new File("data.txt");
//        try {
//            boolean createNewFile = file.createNewFile();
//            System.out.println("File Created = "+createNewFile);
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
//}
//
//
//
//}

//How to read a file ?

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

