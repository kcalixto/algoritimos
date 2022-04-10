package com.kaua.ado02;

import java.util.Scanner;

public class ADO02_01 {
    public static void main(String[] args) {

        double num;

        Scanner input = new Scanner(System.in);

        do {
            num = input.nextDouble();

            if (num >= 100) {
                System.out.println(num + 150);
            } else {
                System.out.println("Digite um número maior ou igual a 100");
            }
        } while (num < 100);

    }
}
