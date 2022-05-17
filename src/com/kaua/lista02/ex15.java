package com.kaua.lista02;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
     
        System.out.println("15. Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse número");

        Scanner input = new Scanner(System.in);
        int n, result = 1;

        System.out.println("Digite um número: ");
        n = input.nextInt();

        System.out.print("!" + n + " = ");
        for (int i = n; i >= 1; i--) {
            if (i == 1) {
                System.out.print(i);
            }else{
                System.out.print(i + " * ");
            }
            result*=i;
        }

        System.out.println("\n!" + n + " = " + result);
    }
}
