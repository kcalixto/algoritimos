package com.kaua.lista04;

public class ex5 {
    public static void main(String[] args) {
        // 5. Dado um vetor de números inteiros, fazer um programa que imprima a média
        // dos elementos do vetor.

        System.out.println(
                "5. Dado um vetor de números inteiros, fazer um programa que imprima a média dos elementos do vetor.");

        int[] arr = new int[] { 1, 3, 5 };
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        System.out.println("media: " + (sum / arr.length));
    }
}
