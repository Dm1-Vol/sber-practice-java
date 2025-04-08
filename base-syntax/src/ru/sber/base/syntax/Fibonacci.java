package ru.sber.base.syntax;

import java.util.Scanner;

import static java.util.function.Predicate.not;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        Integer n = in.nextInt();
        if(n<2){
            System.out.print("введено недопустимое значение n");
        } else{
            if(n>100){
                System.out.print("введено недопустимое значение n");
            } else {
               Integer m1 = 1;
               Integer m2 = 1;
               for(int i = 1; i <= n; i++){
                   System.out.print(m1);
                   System.out.print(' ');
                   m2 = m1 + m2;
                   m1 = m2 - m1;
               }
            }
        }
    }
}
