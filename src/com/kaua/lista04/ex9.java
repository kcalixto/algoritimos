package com.kaua.lista04;

public class ex9 {
    public static void main(String[] args) {
        // 9. Dados dois vetores A e B de mesma dimensão, fazer um programa que calcule
        // e imprima o produto de
        // cada elemento de A pelo correspondente elemento de B. O resultado deve ser
        // armazenado em um vetor
        // C.

        System.out.println(
                "9. Dados dois vetores A e B de mesma dimensão, fazer um programa que calcule e imprima o produto de...");

        int[] arra = new int[] { 1, 3, 5 };
        int[] arrb = new int[] { 1, 3, 5 };
        int[] arrc = new int[3];

        for (int i = 0; i < arrc.length; i++) {
            arrc[i] = arra[i] * arrb[i];
        }

        for (int i : arrc) {
            System.out.println(i);
        }
    }
}
