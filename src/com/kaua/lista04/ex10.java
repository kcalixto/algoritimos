package com.kaua.lista04;

public class ex10 {
    public static void main(String[] args) {
        // 10. Dado um vetor de números reais e um número real, fazer um programa que
        // multiplique os elementos de
        // posição ímpar do vetor pelo número real dado e imprima o resultado.

        System.out.println(
                "10. Dado um vetor de números reais e um número real, fazer um programa que multiplique os elementos de...");

        int[] arr = new int[] { 1, 3, 5 };
        int n = 10;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i] + " * " + n + " = " + (arr[i] * n));
            }
        }

    }
}
