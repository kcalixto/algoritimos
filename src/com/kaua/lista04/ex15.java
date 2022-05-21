package com.kaua.lista04;

public class ex15 {
    public static void main(String[] args) {
        // 15. Dado um vetor de números inteiros, fazer um programa que imprima o vetor
        // em ordem crescente

        System.out.println(
                "15. Dado um vetor de números inteiros, fazer um programa que imprima o vetor em ordem crescente");

        int[] arr = new int[] { 1, 4, 3, 5, 2, 6 };
        int[] cresc = new int[arr.length];

        for (int n : arr) {
            for (int j = (cresc.length - 2); j >= 0; j--) {
                if (n > cresc[j]) {
                    cresc[j + 1] = cresc[j];
                    cresc[j] = n;
                }
            }
        }

        for (int i = cresc.length; i > 0; i--) {
            System.out.print(i + " ,");
        }
    }
}
