package ru.sber.base.syntax;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.random;

public class Letter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char a = in.next().charAt(0);
        char b = (char) ('A' +  (int) floor(26*random()));
        Boolean found = (a == b);
        while(!found){
                if(a < 'A'){
                    System.out.println("введено недопустимое значение");
                    System.out.print("a = ");
                    a = in.next().charAt(0);
                } else{
                    if(a > 'Z'){
                        System.out.println("введено недопустимое значение");
                        System.out.print("a = ");
                        a = in.next().charAt(0);
                    } else {
                        found = (a == b);
                        if(b < a){
                            System.out.println("Ищи букву, которая перед ней в алфавите");
                            a = in.next().charAt(0);
                        } else{
                            if(a < b){
                                System.out.println("Ищи букву, которая после нее в алфавите");
                                a = in.next().charAt(0);
                            }
                        }
                    }
                }
        }
        System.out.print("Верно!");
    }
}
