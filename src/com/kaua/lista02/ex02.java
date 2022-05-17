package com.kaua.lista02;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.println("2. Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N");
        int i, n, sum;
        Scanner input = new Scanner(System.in);

        sum = 0;
        i = 0;
        n = input.nextInt();
        System.out.println("Digite um número: ");
        while(i <= n){
            System.out.println(sum + " + " + i + " = " + (sum+=i));
            i++;
        }

    }
}
