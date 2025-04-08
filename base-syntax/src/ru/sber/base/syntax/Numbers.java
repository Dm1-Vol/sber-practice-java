package ru.sber.base.syntax;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        Integer n = in.nextInt();
        if((1 <= n) & (n <= 500)){
            for(int i = 1; i <= n; i++){
                System.out.print(7*i + " ");
            }
        }else{
            System.out.print("Введено недопустимое значение " + n + ". Допустимый диапазон значений: 1 - 500");
        }
    }
}
