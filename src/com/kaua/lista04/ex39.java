package com.kaua.lista04;

import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        // 39. Dadas duas matrizes, a primeira com N x M elementos, e a segunda com M x
        // P elementos, fazer um programa que imprima o produto das duas matrizes.

        System.out.println(
                "39. Dadas duas matrizes, a primeira com N x M elementos, e a segunda com M x P elementos, fazer um programa que imprima o produto das duas matrizes.");

        // getting number
        String scannerInput;
        int height_one, height_two, width_one, width_two;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma altura para a matriz_1: ");
        scannerInput = input.nextLine();
        height_one = Integer.parseInt(scannerInput);
        System.out.println("Digite uma largura para a matriz_1: ");
        scannerInput = input.nextLine();
        width_one = Integer.parseInt(scannerInput);
        System.out.println("Digite uma largura para a matriz_2: ");
        scannerInput = input.nextLine();
        width_two = Integer.parseInt(scannerInput);
        height_two = width_one;

        int[][] matrixOne = new int[height_one][width_one];
        int[][] matrixTwo = new int[height_two][width_two];

        System.out.println();

        for (int column = 0; column < height_one; column++) {
            for (int row = 0; row < width_one; row++) {
                matrixOne[column][row] = (int) (Math.random() * 10);
            }
        }
        for (int column = 0; column < height_two; column++) {
            for (int row = 0; row < width_two; row++) {
                matrixTwo[column][row] = (int) (Math.random() * 10);
            }
        }

        int final_height = Math.max(height_one, height_two);
        int final_width = Math.max(width_one, width_two);

        int[][] matrixOneFixed = new int[final_height][final_width];
        int[][] matrixTwoFixed = new int[final_height][final_width];

        for (int column = 0; column < final_height; column++) {
            for (int row = 0; row < final_width; row++) {
                try {
                    matrixOneFixed[column][row] = matrixOne[column][row];
                } catch (Exception e) {
                    matrixOneFixed[column][row] = 1;
                    continue;
                }
            }
        }

        for (int column = 0; column < final_height; column++) {
            for (int row = 0; row < final_width; row++) {
                try {
                    matrixTwoFixed[column][row] = matrixTwo[column][row];
                } catch (Exception e) {
                    matrixTwoFixed[column][row] = 1;
                    continue;
                }
            }
        }

        System.out.println("\nmatrix_1");
        for (int column = 0; column < height_one; column++) {
            for (int row = 0; row < width_one; row++) {
                System.out.print(matrixOne[column][row] + "   ");
            }
            System.out.println();
        }
        System.out.println("\nmatrix_2");
        for (int column = 0; column < height_two; column++) {
            for (int row = 0; row < width_two; row++) {
                System.out.print(matrixTwo[column][row] + "   ");
            }
            System.out.println();
        }

        System.out.println("\nproduto");
        for (int column = 0; column < final_height; column++) {
            for (int row = 0; row < final_width; row++) {

                int product = matrixOneFixed[column][row] * matrixTwoFixed[column][row];

                if (product >= 10) {
                    System.out.print(product + "  ");
                } else {
                    System.out.print(product + "   ");
                }
            }
            System.out.println();
        }

    }
}