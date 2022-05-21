package com.kaua.lista03;

public class ex3 {
    public static void main(String[] args) {
        // 3. Fazer uma função chamada fatorial que tem como parâmetro de entrada um
        // número inteiro positivo n
        // e fornece como saída o fatorial desse número.
        // Exemplo: se N for 5, a função deve retornar 120, que é a multiplicação de 1 *
        // 2 * 3 * 4 * 5

        System.out.println(
                "3) 3. Fazer uma função chamada fatorial que tem como parâmetro de entrada um número inteiro positivo n...");

        System.out.println(fatorial(5));
    }

    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

}
