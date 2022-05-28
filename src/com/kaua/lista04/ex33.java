package com.kaua.lista04;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        // 33. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa
        // que imprime a posição (linha e coluna) dos elementos negativos da matriz.

        System.out.println(
                "33. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a posição (linha e coluna) dos elementos negativos da matriz.");

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

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                matrix[i][j] = (int) (Math.random() * 20 - 10);
                if (matrix[i][j] >= 0) {
                    System.out.print("   " + matrix[i][j]);
                } else {
                    System.out.print("  " + matrix[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Negative numbers:");
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (matrix[i][j] <= 0) {
                    System.out.println("(" + (i + 1) + ", " + (j + 1) + ")");
                }
            }
        }

    }
}