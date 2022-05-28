package com.kaua.lista04;

import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        // 35. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa
        // que imprime a média dos elementos positivos da matriz.

        System.out.println(
                "35. Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que imprime a média dos elementos positivos da matriz.");

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

        int sum = 0;
        int avg = 0;

        System.out.println();

        for (int column = 0; column < height; column++) {
            for (int row = 0; row < width; row++) {
                matrix[column][row] = (int) (Math.random() * 20 - 10);

                if (matrix[column][row] >= 0) {
                    System.out.print("  " + matrix[column][row]);
                    sum += matrix[column][row];
                    avg++;
                } else {
                    System.out.print(" " + matrix[column][row]);
                }
            }
            System.out.println();
        }

        System.out.println("Soma dos números positivos: " + sum);
        System.out.println("Total de números positivos: " + avg);
        System.out.println("Média dos números positivos: " + (sum / avg));

    }
}