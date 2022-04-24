package com.kaua.lista02;

import java.util.Scanner;

public class ex17 {

  public static void main(String[] args) {
    System.out.println(
      "17. Ler um número inteiro N e calcular e imprimir todos os seus divisores."
    );

    int n;

    Scanner input = new Scanner(System.in);
    System.out.print("Digite um número positivo: ");
    n = input.nextInt();

    System.out.print("Divisores de " + n + " : ");
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
