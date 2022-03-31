package com.kaua.lista01;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        System.out.println(
                "ex17 - Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem 'Valores aceitos', senão escrever 'Valores não aceitos'.");

        int a, b, c, d;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1o Numero: ");
        a = input.nextInt();
        System.out.print("Digite o 2o Numero: ");
        b = input.nextInt();
        System.out.print("Digite o 3o Numero: ");
        c = input.nextInt();
        System.out.print("Digite o 4o Numero: ");
        d = input.nextInt();

        boolean isBGreaterThanC = b > c;
        boolean isDGreaterThanA = d > a;
        int aPlusB = a + b;
        int cPlusD = c + d;
        boolean isCPlustDGreaterThanAPlusB = cPlusD > aPlusB;
        boolean isCPositive = c > 0;
        boolean isDPositive = d > 0;
        boolean isAPair = a % 2 == 0;

        if (isBGreaterThanC &&
                isDGreaterThanA &&
                isCPlustDGreaterThanAPlusB &&
                isCPositive &&
                isDPositive &&
                isAPair) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }

    }
}
