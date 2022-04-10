package com.kaua.ado02;

import java.util.Scanner;

public class ADO02_04 {
    public static double[] cost = new double[] { 0.20, 0.25, 0.30 };
    public static double minimumValue = 11.90;

    public static void main(String[] args) {
        double usage;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu kWh consumido neste mês: ");
        usage = input.nextDouble();

        double finalCost = calculator(usage);

        if (finalCost >= minimumValue) {
            System.out.println("Sua conta será em torno de " + finalCost + " R$ este mês.");

        } else {
            System.out.println("Sua conta será em torno de " + minimumValue + " R$ este mês.");

        }
    }

    public static double calculator(double usage) {

        if (usage >= 500) {
            return (usage * cost[2]);
        } else if (usage >= 150) {
            return (usage * cost[1]);
        } else {
            return (usage * cost[0]);
        }

    }
}
