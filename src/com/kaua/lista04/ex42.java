package com.kaua.lista04;

import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
        // 42. Fazer um programa que lê duas matrizes A e B de números inteiros e
        // imprima o produto do maior número de A pelo maior número de B.

        System.out.println(
                "42. Fazer um programa que lê duas matrizes A e B de números inteiros e imprima o produto do maior número de A pelo maior número de B.");

        // getting number
        String scannerInput;
        int width_one, width_two, height_one, height_two;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma altura para a matriz_1: ");
        scannerInput = input.nextLine();
        height_one = Integer.parseInt(scannerInput);
        System.out.println("Digite uma largura para a matriz_1: ");
        scannerInput = input.nextLine();
        width_one = Integer.parseInt(scannerInput);
        System.out.println("---");
        System.out.println("Digite uma altura para a matriz_2: ");
        scannerInput = input.nextLine();
        height_two = Integer.parseInt(scannerInput);
        System.out.println("Digite uma largura para a matriz_2: ");
        scannerInput = input.nextLine();
        width_two = Integer.parseInt(scannerInput);

        int[][] matrixOne = new int[height_one][width_one];
        int[][] matrixTwo = new int[height_two][width_two];

        for (int column = 0; column < height_one; column++) {
            for (int row = 0; row < width_one; row++) {
                matrixOne[column][row] = (int) (Math.random() * 100);
            }
        }
        for (int column = 0; column < height_two; column++) {
            for (int row = 0; row < width_two; row++) {
                matrixTwo[column][row] = (int) (Math.random() * 100);
            }
        }
        System.out.println();
        System.out.println("matrix_1: ");
        for (int column = 0; column < height_one; column++) {
            for (int row = 0; row < width_one; row++) {
                if (matrixOne[column][row] >= 10) {
                    System.out.print(matrixOne[column][row] + " ");
                } else {
                    System.out.print(matrixOne[column][row] + "  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("matrix_2: ");
        for (int column = 0; column < height_two; column++) {
            for (int row = 0; row < width_two; row++) {
                if (matrixTwo[column][row] >= 10) {
                    System.out.print(matrixTwo[column][row] + " ");
                } else {
                    System.out.print(matrixTwo[column][row] + "  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        int max1 = getMaxNumber(matrixOne), max2 = getMaxNumber(matrixTwo);

        System.out.println("Maior número da matrix_1: " + max1);
        System.out.println("Maior número da matrix_2: " + max2);

        System.out.println("Produto: " + max1 * max2);
    }

    public static int getMaxNumber(int[][] matrix) {
        int max = matrix[0][0];

        for (int[] rows : matrix) {
            for (int value : rows) {
                if (value >= max) {
                    max = value;
                }
            }
        }

        return max;
    }
}