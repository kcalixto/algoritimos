package com.kaua.lista02;

public class ex08 {
    public static void main(String[] args) {
        System.out.println("8. Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73");

        int sum = 0, size = 0;

        for (int i = 13; i <= 73; i++) {
            if(i % 2 == 0){
                sum+=i;
                size++;
            }
        }

        System.out.println("Média aritmética dos números pares compreendidos entre 13 e 73:\n" + (sum / size));
    }
}
