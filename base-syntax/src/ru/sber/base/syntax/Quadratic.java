package ru.sber.base.syntax;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("a = ");
        float a = in.nextFloat();
        System.out.print("b = ");
        float b = in.nextFloat();
        System.out.print("c = ");
        float c = in.nextFloat();
        if(a != 0){
            if(b*b - 4*a*c > 0){
                System.out.println("X1 = " + ((-b - sqrt(b*b - 4*a*c))/(2*a)));
                System.out.println("X2 = " + ((-b + sqrt(b*b - 4*a*c))/(2*a)));
            } else{
                if(b*b - 4*a*c == 0){
                    System.out.println("X = " + ((-b/(2*a))));
                }
            }
                System.out.println("нет корней");
        } else{
            if(b != 0){
                System.out.println("X = " + -c/b);
            } else{
                if (c != 0){
                    System.out.println("нет корней");
                }
            }
        }
    }
}
