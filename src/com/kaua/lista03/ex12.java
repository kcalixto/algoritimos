package com.kaua.lista03;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        // 12. Faça uma função que recebe, por parâmetro, a altura (alt) e o sexo de uma
        // pessoa, e retorna o seu peso
        // ideal.
        // Para homens, você calcular o peso ideal usando a fórmula: P = 72,7 * altura -
        // 58.
        // Para mulheres, utilize a fórmula: P = 62,1 * altura – 44,7.

        System.out.println(
                "12) 12. Faça uma função que recebe, por parâmetro, a altura (alt) e o sexo de uma pessoa, e retorna o seu peso...");

        // getting number
        String scannerInput;
        double num;
        System.out.println("Digite sua altura: ");
        Scanner input = new Scanner(System.in);
        scannerInput = input.nextLine();
        num = Double.parseDouble(scannerInput);
        System.out.println("Digite seu genero de nascença (M ou F): ");
        scannerInput = input.nextLine();

        System.out.println("peso ideal " + mmc(num, scannerInput));

    }

    public static double mmc(double height, String gender) {
        if (gender.equalsIgnoreCase("M")) {
            return 72.7 * height - 58;
        } else {
            return 62.1 * height - 44.7;
        }
    }

}
