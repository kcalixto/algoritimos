package com.kaua.lista02;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        System.out.println("3. Escreva um programa que leia um conjunto de 10 números inteiros positivos");
        int n;

        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 10 números: ");
        for (int i = 0; i < 10; i++) {
            n = input.nextInt();
            list.add(n);
        }
        list.sort(null);

        System.out.println("maior número: " + list.get(list.size() - 1));

    }
}
