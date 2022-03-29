package com.kaua.lista01;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        System.out.println(
                "ex07 - Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do triângulo.");

        double a, b, hipotenusa;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        a = input.nextDouble();
        System.out.println("Digite outro número:");
        b = input.nextDouble();

        hipotenusa = Math.sqrt((a * a) + (b * b));

        System.out.println("\nA hipotenusa do triângulo é: " + hipotenusa + "\n");
    }
}
