package com.kaua.lista02;

import java.util.Scanner;

public class ex16 {

  public static void main(String[] args) {
    System.out.println(
      "16. Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida do usuário."
    );

    int n, i = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("Digite a quantidade de número para ler: ");
    n = input.nextInt();

    do {
      System.out.print("\nDigite um número: ");
      int num = input.nextInt();

      if (num == 0) {
        System.out.println("nullo");
      } else {
        if (num % 2 == 0) {
          System.out.print("par! ");
        } else {
          System.out.print("ímpar! ");
        }
        if (num > 0) {
          System.out.println("positivo!");
        } else {
          System.out.println("negativo!");
        }
      }

      i++;
    } while (i < n);
  }
}
