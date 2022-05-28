package com.kaua.lista04;

import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        // 38. Dada uma matriz de tamanho N x N, de números inteiros, fazer um programa
        // que imprime os números da parte superior da diagonal principal.

        System.out.println(
                "38. Dada uma matriz de tamanho N x N, de números inteiros, fazer um programa que imprime os números da parte superior da diagonal principal.");

        // getting number
        String scannerInput;
        int height;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um tamanho para a matriz: ");
        scannerInput = input.nextLine();
        height = Integer.parseInt(scannerInput);

        int[][] matrix = new int[height][height];

        System.out.println();

        for (int column = 0; column < height; column++) {
            for (int row = 0; row < height; row++) {
                matrix[column][row] = (int) (Math.random() * 10);
            }
        }

        System.out.println("ORIGINAL");
        for (int column = 0; column < height; column++) {
            for (int row = 0; row < height; row++) {
                System.out.print(matrix[column][row] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSUPERIOR + DIAGONAL");
        int printed = 1;
        for (int column = 0; column < height; column++) {
            for (int row = 0; row < height; row++) {
                if (column == 0) {
                    System.out.print(matrix[column][row] + " ");
                } else {
                    if (row == printed) {
                        System.out.print(matrix[column][row] + " ");
                        printed++;
                        break;
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            if (printed >= height) {
                break;
            }
            System.out.println();
        }

    }
}