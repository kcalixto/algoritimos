package com.kaua.lista02;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        System.out.println("19. Escreva um programa que repita a leitura de uma senha até que ela seja válida.");

        String password, typed;
        Scanner input = new Scanner(System.in);

        password = "2002";

        System.out.print("Digite sua senha: ");
        typed = input.nextLine();
        do {
            System.out.print("Senha inválida! :( tente novamente: ");
            typed = input.nextLine();
        } while (!password.equals(typed));

        System.out.println("\nAcesso permitido, bem vindx! :)");
    }
}
