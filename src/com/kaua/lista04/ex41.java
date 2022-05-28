package com.kaua.lista04;

import java.util.Scanner;

public class ex41 {
    public static void main(String[] args) {
        // 41. Fazer uma função que tem como parâmetro de entrada uma matriz MxN de
        // números inteiros e fornece como saída o maior número dentro do matriz.

        System.out.println(
                "41. Fazer uma função que tem como parâmetro de entrada uma matriz MxN de números inteiros e fornece como saída o maior número dentro do matriz.");

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

        for (int column = 0; column < height; column++) {
            for (int row = 0; row < width; row++) {
                matrix[column][row] = (int) (Math.random() * 99);
            }
        }

        for (int column = 0; column < height; column++) {
            for (int row = 0; row < width; row++) {
                if (matrix[column][row] >= 10) {
                    System.out.print(matrix[column][row] + " ");
                } else {
                    System.out.print(matrix[column][row] + "  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Maior número da matrix: " + getMaxNumber(matrix));

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