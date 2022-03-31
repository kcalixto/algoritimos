package com.kaua.lista01;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        System.out.println(
                "ex16 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas");

        int[] timeArray = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
                23,
                0 };

        boolean done = false;
        int startTime, endTime, passedTime, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o horário de início: ");
        startTime = input.nextInt();
        System.out.println("Digite o horário de término: ");
        endTime = input.nextInt();

        passedTime = 0;
        i = timeArray[startTime];
        while (!done) {
            if (i >= timeArray.length - 1) {
                i = 0;
            }
            i++;
            passedTime++;
            if (timeArray[i] == endTime) {
                done = true;
            }
        }

        System.out.println("o jogo rodou por " + passedTime + "h");
    }
}
