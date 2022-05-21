package com.kaua.lista03;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        // 6. Modificar a função do Exercício 5 da seguinte forma: além dos parâmetros
        // de entrada reais a, b, c, um
        // quarto parâmetro d deve ser adicionado.
        // Esse parâmetro poderá ter dois valores: 1 ou 2.
        // Ele será responsável para decidir se a saída da função vai ser a maior ou a
        // menor raiz (no caso de raízes
        // iguais, considere a maior raiz). Considere que 1 serve para obter a maior
        // raiz e 2 para obter a menor raiz.
        // Novamente, se não houver raízes reais, a função deve retornar o número −1

        System.out.println(
                "6) 6. Modificar a função do Exercício 5 da seguinte forma: além dos parâmetros de entrada reais a, b, c, um..");
        // getting number
        String scannerInput;
        double a, b, c;
        byte param;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        scannerInput = input.nextLine();
        a = Double.parseDouble(scannerInput);
        System.out.println("Digite outro número: ");
        scannerInput = input.nextLine();
        b = Double.parseDouble(scannerInput);
        System.out.println("Digite só mais um número: ");
        scannerInput = input.nextLine();
        c = Double.parseDouble(scannerInput);
        System.out.println("Digite o parametro (1 = maior raiz, 2 = menor raiz): ");
        scannerInput = input.nextLine();
        param = Byte.parseByte(scannerInput);

        System.out.println(BhaskaraCalc(a, b, c, param));
    }

    public static double BhaskaraCalc(double a, double b, double c, byte param) {
        double delta = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        if (Double.isNaN(delta)) {
            return -1;
        }
        double positiveCalc = (-b + delta) / 2 * a;
        double negativeCalc = (-b - delta) / 2 * a;

        if (param == 1) {
            return Math.max(positiveCalc, negativeCalc);
        }
        return Math.min(positiveCalc, negativeCalc);

    }
}
