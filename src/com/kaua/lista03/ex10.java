package com.kaua.lista03;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // 10. Faça uma função que recebe a idade de um nadador por parâmetro e retorna
        // , também por parâmetro, a
        // categoria desse nadador (tipo String) de acordo com a tabela abaixo

        System.out.println(
                "10) 10. Faça uma função que recebe a idade de um nadador por parâmetro e retorna , também por parâmetro...");

        // getting number
        String scannerInput;
        int age;
        System.out.println("Digite a idade: ");
        Scanner input = new Scanner(System.in);
        scannerInput = input.nextLine();
        age = Integer.parseInt(scannerInput);

        System.out.println(nadador(age));

    }

    public static String nadador(int age) {
        if (age > 17) {
            return "Adulto";
        } else if (age > 13) {
            return "Juvenil B";
        } else if (age > 10) {
            return "Juvenil A";
        } else if (age > 7) {
            return "Infantil A";
        } else {
            return "Infantil B";
        }
    }
}
