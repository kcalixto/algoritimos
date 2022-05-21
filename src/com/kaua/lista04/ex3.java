package com.kaua.lista04;

public class ex3 {
    public static void main(String[] args) {
        // 3. Dado um vetor de números inteiros, fazer um programa que imprima o maior
        // elemento do veto

        System.out.println(
                "3. Dado um vetor de números inteiros, fazer um programa que imprima o maior elemento do vetor.");

        int[] arr = new int[] { 1, 3, 2, 4 };
        int big = arr[0];

        for (int i : arr) {
            if(i > big){
                big = i;
            }
        }

        System.out.println(big);

    }
}
