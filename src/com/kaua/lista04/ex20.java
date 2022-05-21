package com.kaua.lista04;

public class ex20 {
    public static void main(String[] args) {
        // 20. Dado um vetor de números inteiros, fazer um programa que copie para outro
        // vetor os número que são
        // múltiplos de 3. Caso existam, imprimir os elementos que estão nas posições
        // ímpares desse vetor.

        System.out.println(
                "20. Dado um vetor de números inteiros, fazer um programa que copie para outro vetor os números que ...");

        int[] arr = new int[] { 1, 3, 5, 9, 18, 36, 30 };
        int amount = 0;

        for (int i : arr) {
            if (i % 3 == 0) {
                amount++;
            }
        }

        if (amount != 0) {
            int counter = 0;
            int[] result = new int[amount];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 3 == 0) {
                    result[counter] = arr[i];
                    counter++;
                }
            }

            for (int i = 0; i < result.length; i++) {
                if (i % 2 != 0) {
                    System.out.print(result[i] + " ,");
                }
            }
        } else {
            System.out.println("nenhum valor multiplo  de 3");
        }
    }
}
