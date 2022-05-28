package com.kaua.lista03;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        // 14. Faça uma função que receba dois números inteiros: um valor A e um valor
        // N. Imprimir a soma dos N
        // números a partir de A (inclusive). Se N for negativo ou ZERO, a função deve
        // retornar -1.
        // Exemplo: se A for 3 e N for 2, o resultado deverá ser 7, pois é a soma de 3 +
        // 4.

        System.out.println(
                "14. Faça uma função que receba dois números inteiros: um valor A e um valor N. Imprimir a soma dos...");

        int A, N;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        A = Integer.parseInt(input.nextLine());
        System.out.println("Digite outro número: ");
        N = Integer.parseInt(input.nextLine());
        sum(A, N);
    }

    public static void sum(int a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++, a++) {
            sum+=a;
            if (i == n - 1) {
                System.out.print(a);
            } else {
                System.out.print(a + " + ");
            }
        }

        System.out.print(" = " + sum);
    }
}
