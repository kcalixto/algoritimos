package com.kaua.lista02;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        System.out.println("10. Faça um programa que calcule e imprima o resultado da soma");
        double sum = 0;
        int maxNum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para limitar a serie de somas: ");
        maxNum = input.nextInt();

        for (int i = 2; i <= maxNum; i++) {
            sum+=(double) 1/i;
        }
        System.out.print("S = " + String.format("%.2f", sum - 1));
    }
}
