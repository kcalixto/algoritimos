package com.kaua.ado02;

import java.util.Scanner;

public class ADO02_03 {
    public static void main(String[] args) {
        double weight, height;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu peso em kg: ");
        weight = input.nextDouble();
        System.out.println("Digite sua altura em cm (1,70m = 170cm) : ");
        height = input.nextDouble();

        double imc = weight / (height * height);

        System.out.println("Grau de obesidade: " + overweight(imc));
    }

    public static String overweight(double imc) {
        if (imc < 0) {
            return "Os dados inseridos podem estar incorretos...";
        }
        if (imc >= 30) {
            return "Obeso mórbido";

        } else if (imc >= 26) {
            return "Obeso";
        } else {
            return "Normal";
        }
    }
}
