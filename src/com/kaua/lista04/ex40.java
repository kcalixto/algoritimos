package com.kaua.lista04;

import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        // 40. Dada uma matriz de tamanho N x M, de números inteiros, verificar se um
        // dado número inteiro faz parte dos elementos dessa matriz. Caso faça, imprimir
        // a posição em que esse número se encontra dentro da matriz.

        System.out.println(
                "40. Dada uma matriz de tamanho N x M, de números inteiros, verificar se um dado número inteiro faz parte dos elementos dessa matriz. Caso faça, imprimir a posição em que esse número se encontra dentro da matriz.");

        // getting number
        String scannerInput;
        int height, width, num;
        try (Scanner input = new Scanner(System.in);) {

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
                    matrix[column][row] = (int) (Math.random() * 99);
                }
            }
            while (true) {
                System.out.println("Qual número deseja proucrar na matrix?");
                scannerInput = input.nextLine();
                num = Integer.parseInt(scannerInput);

                System.out.println("\nmatrix:");
                String pos = "";
                for (int column = 0; column < height; column++) {
                    for (int row = 0; row < width; row++) {
                        if (matrix[column][row] == num) {
                            pos += "(" + column + "," + row + ")";
                        }
                        if(matrix[column][row] >= 10){
                            System.out.print(matrix[column][row] + " ");
                        }else{
                            System.out.print(matrix[column][row] + "  ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
                if (pos == "") {
                    System.out.println("Não encontrei o número " + num);
                } else {
                    System.out.println(num + " encontrado em " + pos);
                }
                System.out.println("-------------------------------------");
            }

        } catch (Exception e) {
            System.out.println("Inválido, tente novamente.");
        }
    }
}