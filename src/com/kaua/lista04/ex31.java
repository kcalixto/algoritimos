package com.kaua.lista04;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        // 31. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa
        // que imprime a soma dos elementos de cada coluna das da matriz.

        System.out.println(
                "31. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a soma dos elementos de cada coluna das da matriz.");

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
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + "   ");
                sum[j] += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("------------------------");
        for (int j : sum) {
            System.out.print(j + " ");
        }
    }
}