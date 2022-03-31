package com.kaua.lista01;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        System.out.println(
                "ex12 - Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um quadrado de lado L e um círculo de raio R. Imprimir na tela qual o maior: 'Quadrado' ou 'Círculo'.");

        double l, r, π;
        π = 3.14159;
        double lArea, rArea;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        l = input.nextDouble();
        System.out.println("Digite o raio do cículo: ");
        r = input.nextDouble();

        lArea = l * l;
        rArea = (r * r) * π;
        System.out.println("Um quadrado de lado " + l + " tem uma área de " + lArea);
        System.out.println("Um círculo de raio "+r+" tem uma área de " + rArea);

        if(lArea > rArea){
            System.out.println("O maior é o quadrado.");
        }else if (lArea == rArea){
            System.out.println("Ambos tem o mesmo tamanho...");
        }else{
            System.out.println("O círculo é o maior.");
        }

    }
}
