package com.kaua.lista02;

import java.util.Arrays;
import java.util.Scanner;

public class ex18 {

  public static void main(String[] args) {
    System.out.println(
      "18. A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é conhecida como série de Fibonacci."
    );

    int n, next = 0, old = 0, oldest = 0;
    Scanner input = new Scanner(System.in);

    System.out.print(
      "Digite um número para limitar sequencia de Fibonacci (menor que 46): "
    );

    do{
        n = input.nextInt();
    }while(n > 46);

    int[] arr = new int[n];

    //default
    arr[0] = 0;
    arr[1] = 1;
    arr[2] = 1;

    for (int i = 3; i < n; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }

    System.out.println(Arrays.toString(arr));
  }
}
