package com.kaua.lista01;

import java.util.ArrayList;
import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        System.out.println(
                "ex18 - Leia 3 números decimais A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados.");

        double a, b, c;
        ArrayList<Double> valuesToSort = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1o Numero: ");
        a = input.nextInt();
        System.out.print("Digite o 2o Numero: ");
        b = input.nextInt();
        System.out.print("Digite o 3o Numero: ");
        c = input.nextInt();

        valuesToSort.add(a);
        valuesToSort.add(b);
        valuesToSort.add(c);
        valuesToSort.sort(null);
        a = valuesToSort.get(2);
        b = valuesToSort.get(1);
        c = valuesToSort.get(0);

        if (a >= (b + c))
            System.out.println("NAO FORMA TRIÂNGULO");
        if ((a * a) == ((b * b) + (c * c)))
            System.out.println("TRIÂNGULO RETÂNGULO");
        if ((a * a) > ((b * b) + (c * c)))
            System.out.println("TRIÂNGULO OBTUSÂNGULO");
        if ((a * a) < ((b * b) + (c * c)))
            System.out.println("TRIÂNGULO ACUTÂNGULO");
        if (a == b && b == c)
            System.out.println("TRIÂNGULO EQUILÁTERO");
        if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a))
            System.out.println("TRIÂNGULO ISÓSCELES");
    }
}
