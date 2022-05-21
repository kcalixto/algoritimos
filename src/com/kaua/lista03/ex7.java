package com.kaua.lista03;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        // 7. Faça uma função que recebe por parâmetro o raio (R) de uma esfera e
        // calcula o seu volume, onde o
        // volume é dado por:
        // V = 4/3 * π * Rˆ3

        System.out.println(
                "7) 7. Faça uma função que recebe por parâmetro o raio (R) de uma esfera e calcula o seu volume, onde o...");

        // getting number
        String scannerInput;
        double num;
        System.out.println("Digite o raio do círculo: ");
        Scanner input = new Scanner(System.in);
        scannerInput = input.nextLine();
        num = Double.parseDouble(scannerInput);

        System.out.println("Volume = " + func(num));
    }

    public static double func(double r) {
        double fourthree = (double) 4 / 3;
        double pow = (double) Math.pow(r, 3);

        return fourthree * Math.PI * pow;
    }
}
