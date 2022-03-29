package com.kaua.lista01;

public class ex09 {
    public static void main(String[] args) {
        System.out.println("ex09 - Escreva um programa que leia o número de cadastro de um funcionário");

        double userHours, userPayment;

        int userID = (int) (Math.random());
        // 504 = 24h per 21 days, 21 = 1h per 21 days
        userHours = Math.random() * (504 - 21 + 1);

        // 100 = max salary/h, 5 = min salary/h
        userPayment = Math.random() * (100 - 5 + 1);

        System.out.println("O funcionário número " + userID + " trabalhou " + String.format("%.2f", userHours)
                + "h por " + String.format("%.2f", userPayment) + "R$/h\nTotalizando: "
                + String.format("%.2f", (userPayment * userHours)) + "R$ no mês");

    }
}
