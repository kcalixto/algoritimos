package com.kaua.lista02;

import java.util.Scanner;

public class ex21 {

  public static void main(String[] args) {
    System.out.println(
      "21. Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores..."
    );

    String isPerfectNumber = "não é";
    int n, sum = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Digite um número positivo: ");
    n = input.nextInt();

    System.out.print("Divisores de " + n + " : ");
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum += i;
        System.out.print(i + " ");
      }
    }

    if (sum == n) {
      isPerfectNumber = "é";
    }

    System.out.println(
      "\n" + n + " " + isPerfectNumber + " um número perfeito."
    );
  }
}
