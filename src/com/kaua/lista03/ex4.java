package com.kaua.lista03;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        double div;
        // 4. Fazer um programa que lê um número inteiro positivo N e imprime a divisão
        // do produto dos n primeiros
        // números positivos pela soma dos n primeiros números positivos.
        // Em outras palavras, você deve dividir o fatorial pela somatoria do número.
        // Obrigatório utilizar as
        // funções elaboradas nos exercícios 2 e 3.

        System.out.println(
                "4) 4. Fazer um programa que lê um número inteiro positivo N e imprime a divisão do produto dos n primeiros...");

        // getting number
        String scannerInput;
        int num;
        System.out.println("insira um número: ");
        Scanner input = new Scanner(System.in);
        scannerInput = input.nextLine();
        num = Integer.parseInt(scannerInput);

        div = fatorial(num) / somatoria(num);

        System.out.println(div);

    }

    public static int somatoria(int num1) {
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            sum += i;
        }
        return sum;
    }

    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}
