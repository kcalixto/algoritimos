package com.kaua.lista03;

public class ex14 {
    public static void main(String[] args) {
        // 14. Faça uma função que receba dois números inteiros: um valor A e um valor
        // N. Imprimir a soma dos N
        // números a partir de A (inclusive). Se N for negativo ou ZERO, a função deve
        // retornar -1.
        // Exemplo: se A for 3 e N for 2, o resultado deverá ser 7, pois é a soma de 3 +
        // 4.

        System.out.println(
                "14) 14. Faça uma função que receba dois números inteiros: um valor A e um valor N. Imprimir a soma dos N...");
    }

    public static int calc(int a, int max){
        int sum = 0;
        if(max <= 0){
            return -1;
        }
        for(int i = a; i <= max; i++){
            sum += i;
        }

        return a + sum;
    }
}
