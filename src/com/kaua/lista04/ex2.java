package com.kaua.lista04;

public class ex2 {
    public static void main(String[] args) {
        // 2. Dado um vetor de números reais, fazer um programa que some todos os
        // elementos do vetor e imprima o
        // resultado.

        System.out.println(
                "2. Dado um vetor de números reais, fazer um programa que some todos os elementos do vetor e imprima o...");

        int[] arr = new int[] { 1, 3, 4, 2 };
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        System.out.println("soma: " + sum);

    }
}
