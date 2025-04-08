package ru.sber.base.syntax;

import java.util.Scanner;

public class HelloWorldGraphic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String s = in.nextLine();
        javax.swing.JOptionPane.showMessageDialog(null, "Привет, " + s + '!');
        System.out.print("Привет, " + s + '!');
    }
}