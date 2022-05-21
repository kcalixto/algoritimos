package com.kaua.lista04;

public class ex1 {
    public static void main(String[] args) {

        // 1. Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor

        System.out.println("1. Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor");

        int[] arr = new int[]{1,2,3,4};

        for (int i : arr) {
            System.out.println("element: " + i);
        }

    }
}