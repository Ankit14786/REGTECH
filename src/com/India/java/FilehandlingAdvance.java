package com.India.java;

import java.io.*;

public class FilehandlingAdvance {
    public static void main(String[] args) {
        //Advance concepts like copy etc.
    copyFile();
    }
    public static void copyFile() {
        File file1 = new File("C:/Users/ANKIT_ATYETI/Desktop/ankit/File-handle1.pdf");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file1_copy = new File("C:/Users/ANKIT_ATYETI/Desktop/ankit/File-handle1_Copy.pdf");

        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream(file1);
            fout = new FileOutputStream(file1_copy);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(fin.available());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int i;
        while (true) {
            try {
                if (((i = fin.read()) != -1)) {
                    fout.write(i);

                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fin != null) {
                    try {
                        fout.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


