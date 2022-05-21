package com.kaua.lista04;

public class ex7 {
    public static void main(String[] args) {
        // 7. Dado um vetor de números inteiros e um número inteiro, fazer um programa
        // que multiplique todos os
        // elementos do vetor pelo número real dado e imprima o resultado.

        System.out.println(
                "7. Dado um vetor de números inteiros e um número inteiro, fazer um programa que multiplique todos os...");

        int[] arr = new int[] { 1, 3, 5 };
        int n = 10;

        for (int i : arr) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
