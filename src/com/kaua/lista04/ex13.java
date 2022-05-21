package com.kaua.lista04;

public class ex13 {
    public static void main(String[] args) {
        // 13. Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o
        // vetor C, o qual deve ser
        // composto pelos elementos do vetor A e depois pelos elementos do vetor B.
        // Imprimir o vetor C.

        System.out.println(
                "13. Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser...");

        int[] arra = new int[] { 1, 3, 5 };
        int[] arrb = new int[] { 2, 5, 6 };
        int[] arrc = new int[arrb.length * 2];

        for (int i = 0; i < arra.length; i++) {
            arrc[i] = arra[i];
        }
        for (int i = 0; i < arrb.length; i++) {
            arrc[i + arra.length] = arrb[i];
        }

        for (int i : arrc) {
            System.out.print(i + ", ");

        }
    }
}
