package com.kaua.lista04;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        // 22. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa
        // que preenche e imprime cada elemento da matriz com o número 20.

        System.out.println(
                "22. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime cada elemento da matriz com o número 20.");

        // getting number
        String scannerInput;
        int w, h;
        System.out.println("Digite uma largura para a matriz: ");
        Scanner input = new Scanner(System.in);
        scannerInput = input.nextLine();
        w = Integer.parseInt(scannerInput);
        System.out.println("Digite uma altura para a matriz: ");
        scannerInput = input.nextLine();
        h = Integer.parseInt(scannerInput);

        int[][] matrix = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                matrix[i][j] = 20;
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}