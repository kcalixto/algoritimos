package com.kaua.lista02;

import java.util.Scanner;

public class ex12 {

  public static void main(String[] args) {
    System.out.println(
      "12. Faça um programa que leia um número natural N e calcule a soma"
    );
    double sum = 0;
    int n = 0;

    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número para limitar a serie de somas: ");
    n = input.nextInt();

    System.out.print("S =   ");

    for (int i = 1; i <= n; i++) {
      System.out.print(i + "/" + n + "-" + (i - 1) + "  +  ");
      sum += (double) i / (n - (i - 1));
    }
    //reverse
    for (int i = n; i >= 1; i--) {
      if (i == 1) System.out.print(
        n + "-" + (i - 1) + "/" + i
      ); else System.out.print(n + "-" + (i - 1) + "/" + i + "  +  ");

      sum += (double) (n - (i - 1)) / i;
    }

    System.out.print("\nS = " + String.format("%.2f", sum));
  }
}
