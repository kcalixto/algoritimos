package com.kaua.lista02;

import java.util.ArrayList;
import java.util.Scanner;

public class ex13 {

  public static void main(String[] args) {
    System.out.println(
      "13. Faça um programa que leia um número natural N e calcule a soma "
    );

    double finalSum = 1;
    double result = 0;
    int n;
    ArrayList<Integer> upperNums = new ArrayList<>(), lowerNums = new ArrayList<>();

    Scanner input = new Scanner(System.in);
    System.out.println("Digite um número para limitar a serie de somas: ");
    n = input.nextInt();

    //Filling arrays
    upperNums.addAll(0, loadAllUpperNums(n));
    lowerNums.addAll(0, loadAllLowerNums(n));

    for (int i = 1; i < n; i++) {
      int limit = i;
      //Print board
      printNums(upperNums, limit);
      skipSpaces(1);

      printBlankSpaces(limit);

      result = calcResult(upperNums, lowerNums, limit);
      System.out.print(" = " + result);
      finalSum += result;

      skipSpaces(2);

      printNums(lowerNums, limit);
      skipSpaces(3);
    }

    System.out.println("\n S = " + finalSum);
  }

  public static double calcResult(
    ArrayList<Integer> upperNums,
    ArrayList<Integer> lowerNums,
    int limit
  ) {
    int lastAllowedNumberUpper = upperNums.get(limit);
    int lastAllowedNumberLower = lowerNums.get(limit);

    double upperNumsMult = 1.0;
    double lowerNumsMult = 1.0;

    double result = 0.0;

    for (double num : upperNums) {
      upperNumsMult *= num;
      if (num == lastAllowedNumberUpper) break;
    }

    for (double num : lowerNums) {
      lowerNumsMult *= num;
      if (num == lastAllowedNumberLower) break;
    }

    result = (double) upperNumsMult / lowerNumsMult;

    return result;
  }

  public static void skipSpaces(int amount) {
    for (int i = 0; i < amount; i++) {
      System.out.println();
    }
  }

  public static void printNums(ArrayList<Integer> nums, int limit) {
    int numbersSize = nums.size() - 1;
    int lastNumber = nums.get(numbersSize);
    int lastAllowedNumber = nums.get(limit);

    int i = 0;
    System.out.print("(");
    for (; i <= numbersSize && i <= limit; i++) {
      int currentNumber = nums.get(i);

      if (currentNumber == lastNumber || currentNumber == lastAllowedNumber) {
        System.out.print(currentNumber + ")");
      } else {
        System.out.print(currentNumber + " * ");
      }
    }
  }

  public static void printBlankSpaces(int limit) {
    int trueLimit = 0;
    if (limit >= 10 - 1) {
      trueLimit = (limit + 1) * 4;
    } else {
      trueLimit = (limit + 1) * 3;
    }
    String blankSpaces = "_____";

    int i = 0;

    for (; i <= trueLimit; i++) {
      blankSpaces += "_";
    }

    System.out.print(blankSpaces);
  }

  public static ArrayList<Integer> loadAllUpperNums(int n) {
    ArrayList<Integer> all = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      all.add(i);
    }
    return all;
  }

  public static ArrayList<Integer> loadAllLowerNums(int n) {
    ArrayList<Integer> all = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      all.add(i * 2 - 1);
    }
    return all;
  }
}
