package com.kaua.lista01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.println("ex02 - Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao expoente). Dica: use a função matemática Math.pow(). ");

        Scanner input = new Scanner(System.in);
        int base, exponent;

        System.out.println("Digite a base: ");
        base = input.nextInt();
        System.out.println("Digite o expoente: ");
        exponent = input.nextInt();

        System.out.println(base + " elevado a " + exponent + " = " + (Math.pow(base, exponent)));
    }
}
