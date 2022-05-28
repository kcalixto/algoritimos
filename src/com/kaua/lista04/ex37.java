package com.kaua.lista04;

import java.util.Scanner;

public class ex37 {
    public static void main(String[] args) {
        // 37. Dada uma matriz de tamanho N x M, de números inteiros, imprimir o número
        // de linhas e o número de colunas nulas da matriz. Por exemplo, para a matriz
        // abaixo, deve imprimir: Duas linhas nulas e uma coluna nula.

        System.out.println(
                "37. Dada uma matriz de tamanho N x M, de números inteiros, imprimir o número de linhas e o número de colunas nulas da matriz. Por ex37emplo, para a matriz abaixo, deve imprimir: Duas linhas nulas e uma coluna nula.");

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
                matrix[column][line] = (int) (Math.random() * 2);
                sumLine[line] += matrix[column][line];
                sumColumn[column] += matrix[column][line];
            }
        }

        int nullRow = 0;
        int nullColumn = 0;

        for (int column = 0; column < height + 2; column++) {
            for (int line = 0; line < width + 2; line++) {
                if (line >= width) {
                    if (line == width) {
                        System.out.print("| ");
                    } else if (line == width + 1) {
                        if (column < height) {
                            if (sumColumn[column] == 0) {
                                System.out.print("Null");
                                nullColumn++;
                            }
                        }
                    }

                } else {
                    if (column == height) {
                        System.out.print("+-   ");
                    } else if (column == height + 1) {
                        if (sumLine[line] == 0) {
                            System.out.print("Null ");
                            nullRow++;
                        } else {
                            System.out.print("     ");
                        }
                    } else {
                        System.out.print(matrix[column][line] + "   ");
                    }
                }
            }

            System.out.println();
        }

        System.out.println("Existe(m) " + nullRow + " linhas nulas");
        System.out.println("Existe(m) " + nullColumn + " colunas nulas");

    }
}