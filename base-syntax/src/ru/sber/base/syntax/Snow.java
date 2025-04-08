package ru.sber.base.syntax;

public class Snow {
    public static void main(String[] args){
            for(int i = 1; i <= 6; i++) {

                if((i%2 == 0)){
                    System.out.print(" ");
                    for(int j = 1; j <= 9; j++){

                        System.out.print("*" + " ");
                    }
                } else {
                    for(int j = 1; j <= 10; j++){

                        System.out.print("*" + " ");
                    }

                }

                System.out.println();
            }
    }
}
