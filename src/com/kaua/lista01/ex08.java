package com.kaua.lista01;

import java.util.Arrays;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        System.out.println(
                "ex08 - Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números");
        double sum = 0;
        double allNumbers[];
        Scanner input = new Scanner(System.in);
        
        allNumbers = new double[4];
        
        for (int i = 0; i < allNumbers.length; i++) {
            System.out.println(Arrays.toString(allNumbers));
            System.out.println("Digite um número: ");
            allNumbers[i] = input.nextDouble();
            sum += allNumbers[i];
        }

        System.out.println("A média aritimética de " + Arrays.toString(allNumbers) + " é: " + (sum / allNumbers.length));

    }
}
