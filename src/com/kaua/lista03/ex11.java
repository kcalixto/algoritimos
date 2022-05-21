package com.kaua.lista03;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        // 11. Faça uma função que recebe a média final de um aluno por parâmetro e
        // retorna o seu conceito, conforme
        // a tabela abaixo:

        System.out.println(
                "11) 11. Faça uma função que recebe a média final de um aluno por parâmetro e retorna o seu conceito, conforme...");

        // getting number
        String scannerInput;
        int media;
        System.out.println("Digite a media: ");
        Scanner input = new Scanner(System.in);
        scannerInput = input.nextLine();
        media = Integer.parseInt(scannerInput);

        System.out.println(media(media));

    }

    public static String media(double media) {
        if (media > 8.9) {  
            return "A";
        } else if (media > 6.9) {
            return "B";
        } else if (media > 4.9) {
            return "C";
        } else {
            return "D";
        }
    }
}
