package com.kaua.lista04;

public class ex6 {
    public static void main(String[] args) {
        // 6. Dado um vetor de números inteiros, fazer um programa que imprima o produto
        // dos elementos do vetor

        System.out.println(
                "6. Dado um vetor de números inteiros, fazer um programa que imprima o produto dos elementos do vetor");

        int[] arr = new int[] { 1, 3, 5 };
        int prod = 1;
        for (int i : arr) {
            prod *= i;
        }
        System.out.println("produto: " + prod);
    }
}
