package com.kaua.lista03;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        // 5. Fazer uma função que tem como parâmetros de entrada três números reais a,
        // b, c e fornece como saída a
        // maior raiz da equação do 2º grau:
        // ax x +
        // 2 + b c
        // Nesta questão, você deverá utilizar a fórmula de Báskara. Se não houver
        // raízes reais, a função deve
        // retornar o número −1.

        System.out.println(
                "5) 5. Fazer uma função que tem como parâmetros de entrada três números reais a, b, c e fornece como saída a...");

        // getting number
        String scannerInput;
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        scannerInput = input.nextLine();
        a = Double.parseDouble(scannerInput);
        System.out.println("Digite outro número: ");
        scannerInput = input.nextLine();
        b = Double.parseDouble(scannerInput);
        System.out.println("Digite só mais um número: ");
        scannerInput = input.nextLine();
        c = Double.parseDouble(scannerInput);

        System.out.println(BhaskaraCalc(a, b, c));

    }

    public static double BhaskaraCalc(double a, double b, double c) {
        double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        if (Double.isNaN(delta)) {
            return -1;
        }
        double positiveCalc = (-b + delta) / 2 * a;
        double negativeCalc = (-b - delta) / 2 * a;

        double max = Math.max(positiveCalc, negativeCalc);

        return max;
    }
}
