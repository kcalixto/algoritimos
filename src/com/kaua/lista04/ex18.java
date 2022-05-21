package com.kaua.lista04;

public class ex18 {
    public static void main(String[] args) {
        // 18. Fazer um programa que verifica se determinado número dado está dentro de
        // um vetor também dado.
        // Caso esteja, imprimir a posição em que o número foi encontrado.

        System.out.println(
                "18. Fazer um programa que verifica se determinado número dado está dentro de um vetor também dado...");

        int[] arr = new int[] { 1, 3, 5 };
        int n = 10;
        boolean find = false;
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                find = true;
                pos = i;
                break;
            }
        }

        if (find) {
            System.out.println(n + " encontrado na posicao " + pos);
        } else {
            System.out.println(n + " nao encontrado");

        }

    }
}
