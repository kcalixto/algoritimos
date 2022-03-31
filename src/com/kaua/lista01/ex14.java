package com.kaua.lista01;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        System.out.println("ex14 - Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor.");

        double num1, num2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        num1 = input.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = input.nextDouble();

        if (num1 >= num2) {
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2)); 
        }else {
            System.out.println(num2 + " / " + num1 + " = " + (num2/num1)); 
        }

    }
}
