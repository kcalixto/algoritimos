package com.kaua.lista04;

public class ex4 {
    public static void main(String[] args) {

        // 4. Dado um vetor de números reais, fazer um programa que imprima o menor
        // elemento do vetor.

        System.out
                .println("4. Dado um vetor de números reais, fazer um programa que imprima o menor elemento do vetor.");

        int[] arr = new int[] { 1, 3, 2, 4 };
        int small = arr[0];

        for (int i : arr) {
            if (i < small) {
                small = i;
            }
        }

        System.out.println(small);

    }
}
