package com.kaua.lista04;

public class ex11 {
    public static void main(String[] args) {
        // 11. Dado um vetor de números reais, fazer um programa que imprima os números
        // maiores do que a média
        // dos elementos que estão nas posições pares do vetor.

        System.out.println(
                "11. Dado um vetor de números reais, fazer um programa que imprima os números maiores do que a média...");

        int[] arr = new int[] { 1, 3, 5, 7, 10 };
        int media = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                media += i;
            }
        }

        media = media / arr.length;
        System.out.println("media: " + media);
        for (int i : arr) {
            if (i > media) {
                System.out.println(i);
            }
        }

    }
}
