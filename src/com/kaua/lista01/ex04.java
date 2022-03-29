package com.kaua.lista01;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        System.out.println("ex04 - Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números. (Por exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2. –8 é consecutivo de –9)");
    
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = input.nextInt();
        System.out.println("Digite outro número: ");
        num2 = input.nextInt();

        System.out.println("É consecutivo de "+num1+" o número: "+ (num1 + 1));
        System.out.println("É consecutivo de "+num2+" o número: "+ (num2 + 1));
    }
}
