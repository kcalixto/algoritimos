package com.kaua.lista01;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        System.out.println(
                "ex15 - Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara");

        double num1, num2, num3;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = input.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = input.nextDouble();
        System.out.println("Digite só mais um número: ");
        num3 = input.nextDouble();
        System.out.println("Pronto!");

        double[] results = BhaskaraCalc(num1, num2, num3);
        if (results == new double[] { 0, 0 }) {
            System.out.println("Sem soluções reais.");

        } else {
            System.out.println("O resultado pode ser " + results[0] + " ou " + results[1]);

        }
    }

    public static double[] BhaskaraCalc(double a, double b, double c) {
        try {
            double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
            if (delta == Double.NaN || delta == 0) {
                return new double[] { 0, 0 };
            }
            double positiveCalc = (-b + delta) / 2 * a;
            double negativeCalc = (-b - delta) / 2 * a;
            return new double[] { positiveCalc, negativeCalc };
        } catch (Exception e) {
            System.out.println("error " + e);
            return new double[] { 0, 0 };
        }
    }
}
