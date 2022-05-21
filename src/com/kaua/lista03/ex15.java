package com.kaua.lista03;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        // 15. Escreva uma função que recebe, por parâmetro, dois valores X e Z e
        // calcula e retorna XˆZ
        // (sem utilizar
        // funções ou operadores de potência prontos).
        // Assim sendo, você não pode utilizar a função Math.pow, nem outras existentes
        // no Java.

        System.out.println(
                "15) 15. Escreva uma função que recebe, por parâmetro, dois valores X e Z e calcula e retorna X...");

        // getting number
        String scannerInput;
        int num, pow;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        scannerInput = input.nextLine();
        num = Integer.parseInt(scannerInput);
        System.out.println("Digite outro número: ");
        scannerInput = input.nextLine();
        pow = Integer.parseInt(scannerInput);

        System.out.println("portencia de " + num + " elevado a " + pow + " é: " + pow(num, pow));

    }

    public static int pow(int a, int b) {
        int base = a;
        for (int i = 1; i < b; i++) {
            a *= base;
        }
        return a;
    }

}
