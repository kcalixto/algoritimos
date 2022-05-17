package com.kaua.ado03;

import java.util.Scanner;

public class ADO03_05 {
    public static void main(String[] args) {
        
        int n, count;
        Scanner input = new Scanner(System.in);

        n = 0; count = 0;

        System.out.println("Digite um número entre 2 e 1000: ");
        while(!(n >= 2 && n <= 1000)){
            n = input.nextInt();
        }

        do {
            System.out.println(n + " * " + count + " = " + ( n * count));
            count++;
        } while (count <= 10);

    }
}
