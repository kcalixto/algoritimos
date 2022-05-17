package com.kaua.lista02;

public class ex07 {
    public static void main(String[] args) {
        System.out.println("7. Escreva um programa que imprima todos os múltiplos de 7 menores que 200. Use o laço WHILE.");

        for (int i = 0; i <= 200; i++) {
            if(i % 7 == 0){
                System.out.print(i + " ,");
            }
        }
    }
}
