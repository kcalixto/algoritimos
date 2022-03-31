package com.kaua.lista01;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        System.out.println("ex13 - Fazer um algoritmo que leia três números e imprime o maior deles");

        double num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = input.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = input.nextDouble();
        System.out.println("Digite só mais um número: ");
        num3 = input.nextDouble();
        System.out.println("Pronto!");

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " é o maior número");
            } else {
                System.out.println(num3 + " é o maior número");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " é o maior número");
            } else {
                System.out.println(num3 + " é o maior número");
            }
        }

    }
}
