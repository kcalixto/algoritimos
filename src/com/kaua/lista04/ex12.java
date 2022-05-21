package com.kaua.lista04;

public class ex12 {
    public static void main(String[] args) {
        // 12. Dados dois vetores A e B de mesma dimensão, fazer um programa que
        // verifica a soma e a média de cada
        // vetor, e imprime a maior soma e a menor média.

        System.out.println(
                "12. Dados dois vetores A e B de mesma dimensão, fazer um programa que verifica a soma e a média de cada..");

        int[] arra = new int[] { 1, 3, 5 };
        int[] arrb = new int[] { 4, 3, 5 };

        int[] retur = new int[arra.length * 2];

        for (int i : arra) {
            retur[0] += i;
        }
        for (int i : arrb) {
            retur[1] += i;
        }

        retur[2] = retur[0] / arra.length;
        retur[3] = retur[1] / arrb.length;

        System.out.println(
                "soma a: " + retur[0] + "\nsoma b: " + retur[1] + "\nmedia a: " + retur[2] + "\nmedia b: " + retur[3]);

    }
}
