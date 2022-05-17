package com.kaua.lista02;

public class ex04 {
    public static void main(String[] args) {
        System.out.println("4. Faça um programa que gere a seguinte série: 10, 20, 30, 40, ..., 990, 1000. Use o laço FOR");
        
        for (int i = 10; i <= 1000; i+=10) {
            if(i == 1000) System.out.println(i);
            else System.out.print(i + ", ");
        }
        
    }
}
