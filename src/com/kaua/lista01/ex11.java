package com.kaua.lista01;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        System.out.println("ex11 - Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a mensagem Numero negativo.");
    
        double num;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = input.nextDouble();

        if(num > 0) {
            System.out.println("Número positivo");
        }else if(num == 0){
            System.out.println("Número neutro");
        }else{
            System.out.println("Número negativo");
            
        }

    }
}
