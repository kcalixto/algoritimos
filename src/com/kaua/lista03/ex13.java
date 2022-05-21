package com.kaua.lista03;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        // 13. Faça uma função que recebe, por parâmetro, um valor inteiro e positivo e
        // retorna o número de divisores
        // desse valor

        System.out.println(
                "13) 13. Faça uma função que recebe, por parâmetro, um valor inteiro e positivo e retorna o número de divisores...");

        // getting number
        String scannerInput;
        int num;
        System.out.println("Digite um número: ");
        Scanner input = new Scanner(System.in);
        scannerInput = input.nextLine();
        num = Integer.parseInt(scannerInput);

        System.out.println(num + " tem " + div(num) + " divisores");

    }

    public static int div(int n) {
        int divisors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors++;
            }
        }

        return divisors;
    }
}
