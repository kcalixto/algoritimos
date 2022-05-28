package com.kaua.lista04;

import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        // 36. Dada uma matriz de tamanho N x N, de números inteiros, fazer um programa
        // que imprime os elementos da diagonal principal.

        System.out.println(
                "36. Dada uma matriz de tamanho N x N, de números inteiros, fazer um programa que imprime os elementos da diagonal principal.");

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

        System.out.println();

        for (int column = 0; column < height; column++) {
            for (int row = 0; row < width; row++) {
                matrix[column][row] = (int) (Math.random() * 10);
            }
        }

        System.out.println("ORIGINAL");
        for (int column = 0; column < height; column++) {
            for (int row = 0; row < width; row++) {
                System.out.print(matrix[column][row] + " ");
            }
            System.out.println();
        }

        System.out.println("\nDIAGONAL");
        int printed = 0;
        for (int column = 0; column < height; column++) {
            for (int row = 0; row < width; row++) {
                if (row == printed) {
                    System.out.print(matrix[column][row] + " ");
                    printed++;
                    break;
                } else {
                    System.out.print("  ");
                }
            }
            if(printed >= width){
                break;
            }
            System.out.println();
        }

    }
}