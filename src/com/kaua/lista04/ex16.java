package com.kaua.lista04;

public class ex16 {
    public static void main(String[] args) {
        // 16. Fazer um programa que lê uma sequência de N números inteiros positivos e
        // reordena os elementos da
        // sequência de modo que todos os números pares venham primeiro e todos os
        // ímpares em seguida. Por
        // exemplo, para a sequência [3, 6, 7, 8, 1, 2, 5, 3, 9], a saída deverá ser:
        // [6, 8, 2, 3, 7, 1, 5, 3, 9].

        System.out.println(
                "16. Fazer um programa que lê uma sequência de N números inteiros positivos e reordena os elementos...");

        int[] arr = new int[] { 3, 6, 7, 8, 1, 2, 5, 3, 9 };
        int parAmount = 0;
        int imparAmouunt = 0;

        for (int i : arr) {
            if (i % 2 == 0) {
                parAmount++;
            } else {
                imparAmouunt++;
            }
        }

        int[] par = new int[parAmount];
        int[] impar = new int[imparAmouunt];
        int[] result = new int[parAmount + imparAmouunt];

        int parCounter = 0;
        int imparCounter = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                par[parCounter] = i;
                parCounter++;
            } else {
                impar[imparCounter] = i;
                imparCounter++;
            }
        }

        int counter = 0;
        for (int i : par) {
            result[counter] = i;
            counter++;
        }
        for (int i : impar) {
            result[counter] = i;
            counter++;
        }

        for (int i : result) {
            System.out.print(i + " ,");
        }

    }
}
