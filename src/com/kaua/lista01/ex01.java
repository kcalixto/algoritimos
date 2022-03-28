package com.kaua.lista01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número");
        int num1 = input.nextInt();

        System.out.println("Digite outro número");
        int num2 = input.nextInt();

        System.out.println("O produto de " + num1 + " com " + num2 + " é: " + (num1 * num2));

    }
}
