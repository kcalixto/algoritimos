package com.kaua.lista04;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        // 29. Dada uma matriz de tamanho N x M e um vetor de M elementos, fazer um
        // programa que preencha cada linha da matriz com os elementos do vetor..

        System.out.println(
                "29. Dada uma matriz de tamanho N x M e um vetor de M elementos, fazer um programa que preencha cada linha da matriz com os elementos do vetor..");

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
        int[] arr = new int[h];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                matrix[i][j] = arr[i];
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