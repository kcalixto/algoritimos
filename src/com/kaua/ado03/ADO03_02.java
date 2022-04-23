package com.kaua.ado03;

import java.util.Scanner;

public class ADO03_02 {
    public static void main(String[] args) {
        int x, i;

        Scanner input = new Scanner(System.in);

        x = 0;
        i = 0;

        while (x <= 0){
            System.out.print("Digite um número: ");
            x = input.nextInt();
        }

        System.out.println("Números pares de 1 até "+x+": ");
        
        while (i <= x) {
            if ( i % 2 == 1){
                System.out.print(i + ", ");
            }
            i++;
        }

    }
}
