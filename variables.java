package com.company;

import java.util.Scanner;

public class Main { 

    public static void main(String[] args) {
      
       // misparim shlemim:
       int mispar;
       mispar = 3;
       int number = 4;
       byte num = 31;
       // short 3num;  error!
        short $num;
        long num3 = 10;

        // point number:
        double d = 5.2;
        float f = 3.4f;

        char c = '#';
        boolean b = true;

        String st = "Einat";
        System.out.println(mispar);
        String stringNew = "Einat";
        String stringNew1 = "roy";

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = s.nextInt();
        System.out.println(number);
    }
}
