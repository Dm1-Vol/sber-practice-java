package ru.sber.base.syntax;

import static java.lang.Math.*;

public class Random {
    public static void main(String[] args) {
        Integer[] a = new Integer[100];
        for (int i = 0; i <= 99; i++) {
            a[i] = (int) (floor(1000*random()));
        }
        int m = a[0];
        int n = 0;
        float s = 0;
        for(int i = 0; i <= 99; i++){
            s = (float) (s + a[i]/100.0);
            if(m <= a[i]){
                m = a[i];
                n = i;
            }
        }
        System.out.println("Максимальное значение= " + m + " находится в элементе под индексом " + n);
        System.out.println("Среднее значение= " + s);
    }
}