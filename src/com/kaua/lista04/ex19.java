package com.kaua.lista04;

public class ex19 {
    public static void main(String[] args) {
        // 19. Fazer um programa que imprime os elementos que estão nas posições ímpares
        // de um vetor (começando
        // na posição 1, que corresponde à posição 0 em Java). Por exemplo, para o vetor
        // [6, 8, 2, 3, 7, 1, 5, 3, 9],
        // seriam impressos os números: 6, 2, 7, 5, 9.

        System.out.println(
                "19. Fazer um programa que imprime os elementos que estão nas posições ímpares de um vetor...");

        int[] arr = new int[] { 6, 8, 2, 3, 7, 1, 5, 3, 9 };

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ,");
            }
        }
    }
}
