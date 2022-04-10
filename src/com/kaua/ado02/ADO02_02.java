package com.kaua.ado02;

import java.util.Scanner;

public class ADO02_02 {
    public static void main(String[] args) {
        double num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = input.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = input.nextDouble();

        if (num1 % num2 == 0) {
            System.out.println("A divisão de " + num1 + "por " + num2 + " é exata");
        } else {
            System.out.println("A divisão de " + num1 + "por " + num2 + " não é exata: " + (num1 / num2));
        }
    }
}
