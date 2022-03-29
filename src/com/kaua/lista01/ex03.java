package com.kaua.lista01;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        System.out.println(
                "ex03 - Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado de um número A é representado por A2 = A * A.");

        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = input.nextInt();
        System.out.println("Digite outro número: ");
        num2 = input.nextInt();

        System.out.println("A soma do quadrado de " + num1 + " com " + num2 + " = " + ((num1 * num1) + (num2 * num2)));

    }
}
