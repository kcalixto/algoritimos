package com.kaua.lista04;

public class ex14 {
    public static void main(String[] args) {
        // 14. Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o
        // vetor C, o qual deve ser
        // composto, alternadamente, por um elemento do vetor A e outro do vetor B.
        // Imprimir o vetor C.

        System.out.println(
                "14. Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser...");

        int[] arra = new int[] { 1, 3, 5 };
        int[] arrb = new int[] { 2, 4, 6 };
        int[] arrc = new int[arrb.length * 2];

        for (int i = 0, n = 0; i < arra.length; i++, n += 2) {
            arrc[n] = arra[i];
            arrc[n + 1] = arrb[i];
        }

        for (int i : arrc) {
            System.out.print(i + ", ");

        }

    }
}
