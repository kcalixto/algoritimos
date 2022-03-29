package com.kaua.lista01;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        System.out.println(
                "ex06 - Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre: ");

        double a, b, c, π;
        π = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.println("digite um número");
        a = input.nextDouble();
        System.out.println("digite outro número");
        b = input.nextDouble();
        System.out.println("digite só mais um número :D");
        c = input.nextDouble();

        System.out.println("Pronto!\n");

        System.out.println(
                "a) A área de um triângulo retângulo que tem " + a + " por base e " + c + " por altura é:\n" + (a * c)
                        + "\n");

        System.out.println("b) A área do cículo de raio " + c + " é:\n" + (π * (c * c)) + "\n");
        System.out.println("c) A área do trapézio que tem " + a + " e " + b + " por bases e " + c + " por altura é:\n"
                + (((a + b) / 2) * c) + "\n");
        System.out.println("d) A área do quadrado que tem lado " + b + " é:\n" + (b * b) + "\n");
        System.out.println("e) A área do retângulo que tem lados " + a + " e " + b + " é:\n" + (a * b) + "\n");
        System.out.println("f) O perímetro do retângulo que tem lados " + a + " e " + b + " é:\n" + (a + b + a + b) + "\n");
    }
}
