package com.kaua.lista02;

public class ex10 {
    public static void main(String[] args) {
        double sum = 0;
        System.out.println("10. Faça um programa que calcule e imprima o resultado da soma");

        for (int i = 2; i <= 20; i++) {
            sum+=(double) 1/i;
        }
        System.out.print("S = " + String.format("%.2f", sum - 1));

    }
}
