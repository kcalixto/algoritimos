package com.kaua.lista03;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        // 9. Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e
        // retorna essa idade
        // expressa em dias.

        System.out.println(
                "9) 9. Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e retorna essa idade...");

        System.out.println("Digite sua idade em anos, meses e dias");

        // getting number
        String scannerInput;
        int year, month, day;
        Scanner input = new Scanner(System.in);
        scannerInput = input.nextLine();
        year = Integer.parseInt(scannerInput);
        scannerInput = input.nextLine();
        month = Integer.parseInt(scannerInput);
        scannerInput = input.nextLine();
        day = Integer.parseInt(scannerInput);

        System.out.println("você tem " + days(year, month, day) + " dias de vida");
    }

    public static int days(int y, int m, int d) {
        return d + m * 31 + y * 365;
    }
}
