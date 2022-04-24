package com.kaua.lista02;

import java.util.ArrayList;
import java.util.Scanner;

public class ex14 {
  public static void main(String[] args) {
    System.out.println(
      "14. Faça um programa que leia um número natural N e calcule a soma"
    );

    double result = 0;
    int n;
    ArrayList<Integer> upperNums = new ArrayList<>(), lowerNums = new ArrayList<>();

    Scanner input = new Scanner(System.in);
    System.out.print("Digite um número para limitar a serie de somas: ");
    n = input.nextInt();

    //Filling arrays
    upperNums.addAll(0, loadAllUpperNums(n));
    lowerNums.addAll(0, loadAllLowerNums(n));

    //Print board
    printNums(upperNums, lowerNums);

    result = calcResult(upperNums, lowerNums);

    System.out.println("\nS = " + result);
  }

  public static double calcResult(
    ArrayList<Integer> upperNums,
    ArrayList<Integer> lowerNums
  ) {
    double result = 1.0;

    for (int i = 0; i < upperNums.size(); i++) {
      result += (double) upperNums.get(i) / lowerNums.get(i);
    }

    return result;
  }

  public static void printNums(
    ArrayList<Integer> upperNums,
    ArrayList<Integer> lowerNums
  ) {
    int numbersSize = upperNums.size() - 1;

    int i = 0;

    System.out.print("S = 1 + ");
    for (; i <= numbersSize; i++) {
      int currentUpper = upperNums.get(i);
      int currentLower = lowerNums.get(i);
      if (i == numbersSize) {
        System.out.print(currentUpper + "/" + currentLower);
      } else {
        System.out.print(currentUpper + "/" + currentLower + " + ");
      }
    }
  }

  public static ArrayList<Integer> loadAllUpperNums(int n) {
    ArrayList<Integer> all = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      all.add(2 * i);
    }
    return all;
  }

  public static ArrayList<Integer> loadAllLowerNums(int n) {
    ArrayList<Integer> all = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      all.add(i * 2 + 1);
    }
    return all;
  }
}
