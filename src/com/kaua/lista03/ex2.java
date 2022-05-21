package com.kaua.lista03;

public class ex2 {
    public static void main(String[] args) {
        // 2. Fazer uma função chamada somatoria que tem como parâmetro de entrada um
        // número inteiro positivo
        // N e fornece como saída a soma de todos os números inteiros positivos menores
        // ou iguais a N.
        // Exemplo: se N for 3, a função deve retornar 6, que é a soma de 1 + 2 + 3.

        System.out.println(
                "2) 2. Fazer uma função chamada somatoria que tem como parâmetro de entrada um número inteiro positivo...");

        System.out.println(somatoria(3));

    }

    public static int somatoria(int num1) {
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            sum += i;
        }
        return sum;
    }
}
