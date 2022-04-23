package com.kaua.ado03;

import java.util.ArrayList;
import java.util.Scanner;

public class ADO03_04 {
    public static void main(String[] args) {
        
        int allPositiveNumbersSum, allPositiveNumbersAmount;
        double allPositiveNumbersAvarage;

        allPositiveNumbersSum = 0; allPositiveNumbersAmount = 0; allPositiveNumbersAvarage = 0.0;

        ArrayList<Integer> values = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        System.out.println("Digite 6 números em sequência:");

        while (values.size() < 6) {
            System.out.print((values.size() + 1 )+"º - ");
            int valueToAdd = input.nextInt();
            values.add(valueToAdd);
            if(valueToAdd > 0){
                allPositiveNumbersSum += valueToAdd;
                allPositiveNumbersAmount++;
            }
        }

        allPositiveNumbersAvarage =  (double) allPositiveNumbersSum / allPositiveNumbersAmount;

        System.out.println("Soma de todos os valores positivos digitados: " + allPositiveNumbersSum);
        System.out.println("Quantidade de valores positivos digitados: " + allPositiveNumbersAmount);
        System.out.println("Média decimal dos valores positivos digitados: " + allPositiveNumbersAvarage);

    }
}
