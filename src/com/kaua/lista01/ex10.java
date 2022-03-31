package com.kaua.lista01;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        System.out.println(
                "ex10 - Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).");

        String vendorName;
        double vendorSalary, vendorSelling, vendorProfit, vendorCommission = 0.15;
        Scanner input = new Scanner(System.in);

        System.out.print("Olá, vendedor ou vendedora, digite seu nome: ");
        vendorName = input.nextLine();
        System.out.println("Olá, " + vendorName + "!");
        System.out.print("Digite o seu salário fixo: ");
        vendorSalary = input.nextDouble();
        System.out.print("Agora, " + vendorName + " preciso que digite o seu total de vendas esse mês em R$: ");
        vendorSelling = input.nextDouble();

        vendorProfit = vendorSalary + (vendorCommission * vendorSelling);

        System.out.println("Obrigado por utilizar nossa calculadora!");

        System.out.println("Você receberá " + String.format("%.2f", vendorProfit) + "R$ no final desse mês");

    }
}
