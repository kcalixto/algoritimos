package com.kaua.lista03;

public class ex1 {
    public static void main(String[] args) {

        // 1. Fazer uma função que tem como parâmetro de entrada três números inteiros
        // a, b, c e devolve (retorna)
        // menor dentre os três números.

        System.out.println(
                "1) 1. Fazer uma função que tem como parâmetro de entrada três números inteiros a, b, c e devolve (retorna) menor dentre os três números.");

        System.out.println(func(5, 10, 15));
    }

    public static int func(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
