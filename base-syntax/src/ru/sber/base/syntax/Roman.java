package ru.sber.base.syntax;

import java.util.Scanner;

public class Roman {
    public static void main(String[] args){
        Integer[] a = new Integer[8];
        String[] b = new String[8];
        a[0] = 100;
        a[1] = 50;
        a[2] = 40;
        a[3] = 10;
        a[4] = 9;
        a[5] = 5;
        a[6] = 4;
        a[7] = 1;
        b[0] = "C";
        b[1] = "L";
        b[2] = "XL";
        b[3] = "X";
        b[4] = "IX";
        b[5] = "V";
        b[6] = "IV";
        b[7] = "I";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 100: ");
        Integer n = in.nextInt();
        Integer i = 0;
        String s = "";
        while(n > 0){
            while(n >= a[i]){
                s = s + b[i];
                n = n - a[i];
            }
            i = i + 1;
        }
        System.out.print(s);
    }
}
