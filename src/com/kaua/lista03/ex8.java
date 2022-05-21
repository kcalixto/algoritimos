package com.kaua.lista03;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        // 8. Faça uma função que recebe por parâmetro um valor inteiro e positivo e
        // retorna Verdadeiro caso o valor
        // seja primo, e Falso, caso contrário. Para isso, você terá que usar o tipo de
        // retorno boolean.

        System.out.println(
                "8) 8. Faça uma função que recebe por parâmetro um valor inteiro e positivo e retorna Verdadeiro caso o valor...");

        // getting number
        String scannerInput;
        int num;
        System.out.println("Digite um número: ");
        Scanner input = new Scanner(System.in);
        scannerInput = input.nextLine();
        num = Integer.parseInt(scannerInput);

        if (isPrimo(num)) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
    }

    public static boolean isPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
