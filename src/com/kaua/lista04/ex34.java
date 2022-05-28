package com.kaua.lista04;

import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        // 34. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa
        // que imprime a soma de todos os elementos da matriz.

        System.out.println(
                "34. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a soma de todos os elementos da matriz.");

        // getting number
        String scannerInput;
        int width, height;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma altura para a matriz: ");
        scannerInput = input.nextLine();
        height = Integer.parseInt(scannerInput);
        System.out.println("Digite uma largura para a matriz: ");
        scannerInput = input.nextLine();
        width = Integer.parseInt(scannerInput);

        int[][] matrix = new int[height][width];

        int[] sumLine = new int[width];
        int[] sumColumn = new int[height];
        System.out.println();

        for (int column = 0; column < height; column++) {
            for (int line = 0; line < width; line++) {
                matrix[column][line] = (int) (Math.random() * 10);
                sumLine[line] += matrix[column][line];
                sumColumn[column] += matrix[column][line];
            }
        }

        for (int column = 0; column < height + 2; column++) {
            for (int line = 0; line < width + 2; line++) {
                if (line >= width) {
                    if (line == width) {
                        System.out.print("| ");
                    } else if (line == width + 1) {
                        if (column < height) {
                            System.out.print(sumColumn[column]);
                        }
                    }

                } else {
                    if (column == height) {
                        System.out.print("+- ");
                    } else if (column == height + 1) {
                        System.out.print(sumLine[line] + " ");
                    } else {
                        System.out.print(matrix[column][line] + "  ");
                    }
                }
            }

            System.out.println();
        }

    }
}