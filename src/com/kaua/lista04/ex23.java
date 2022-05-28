package com.kaua.lista04;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        // 23. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa
        // que preenche e imprime cada elemento da matriz com o número 21, se a linha
        // for ímpar, e com 10 se a linha for par.

        System.out.println(
                "23. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche e imprime cada elemento da matriz com o número 21, se a linha for ímpar, e com 10 se a linha for par.");

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
                if(i % 2 != 0) {
                    matrix[i][j] = 21;
                }else{
                    matrix[i][j] = 10;
                }
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