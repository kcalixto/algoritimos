package com.kaua.lista04;

public class ex17 {
    public static void main(String[] args) {
        // 17. Dado um vetor de números reais e um número real, fazer um programa que
        // multiplique todos os
        // elementos do vetor pelo número real dado e imprima o resultado.

        System.out.println(
                "17. Dado um vetor de números reais e um número real, fazer um programa que multiplique todos os...");

        int[] arr = new int[] { 1, 3, 5 };
        int n = 10;

        for (int i : arr) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
