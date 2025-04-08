package ru.sber.base.syntax;

import static java.lang.Math.*;

public class Bubble {
    public static void main(String[] args){
        Integer[] a = new Integer[30];
        for (int i = 0; i <= 29; i++) {
            a[i] = (int) (floor(1000*random()));
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int t = 0;
        boolean stop = true;
        for(int i = 1; i < 30; i++){
            stop = true;
            for(int j = 0; j < (30 - i); j++){
                if(a[j] > a[j+1]){
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                    stop = false;
                }
            }
            if(stop){
                break;
            }
        }
        for (int i = 0; i <= 29; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
