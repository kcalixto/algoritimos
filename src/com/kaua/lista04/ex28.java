package com.kaua.lista04;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        // 28. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa
        // que imprime a soma dos elementos de cada linha da matriz.

        System.out.println(
                "28. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a soma dos elementos de cada linha da matriz.");

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

        int sum = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                sum += matrix[i][j];
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print(" = " + sum);
            System.out.println();
            sum = 0;
        }
    }
}