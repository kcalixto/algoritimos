package com.kaua.lista04;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        // 32. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa
        // que imprime a soma dos elementos das colunas ímpares da matriz.

        System.out.println(
                "32. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a soma dos elementos das colunas ímpares da matriz.");

        // getting number
        String scannerInput;
        int w, h;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma altura para a matriz: ");
        scannerInput = input.nextLine();
        h = Integer.parseInt(scannerInput);
        System.out.println("Digite uma largura para a matriz: ");
        scannerInput = input.nextLine();
        w = Integer.parseInt(scannerInput);

        int[][] matrix = new int[h][w];

        int[] sum = new int[w];

        for (int i = 0; i < h + 2; i++) {
            for (int j = 0; j < w; j++) {
                if (i >= h) {
                    if (i == h) {
                        System.out.print("---");
                    } else {

                        if (j % 2 != 0) {
                            System.out.print(sum[j] + " ");
                        } else {
                            System.out.print("-  ");
                        }
                    }
                } else {
                    matrix[i][j] = (int) (Math.random() * 10);
                    System.out.print(matrix[i][j] + "  ");
                    sum[j] += matrix[i][j];
                }
            }

            System.out.println();
        }
    }
}