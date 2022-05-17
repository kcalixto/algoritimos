package com.kaua.ado03;

public class ADO03_01 {
    public static void main(String[] args) {
        int i, maxNum;

        i = 0;
        maxNum = 100;

        System.out.println("Números pares de 1 até 100: ");

        while (i <= maxNum) {
            i++;
            if ( i % 2 == 0){
                System.out.print(i + ", ");
            }
            
        }

    }
}
