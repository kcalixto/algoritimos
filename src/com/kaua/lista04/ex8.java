package com.kaua.lista04;

public class ex8 {
    public static void main(String[] args) {
        // 8. Dado um vetor de números inteiros e um número inteiro, fazer um programa
        // que verifique se o número
        // está presente no vetor

        System.out.println(
                "8. Dado um vetor de números inteiros e um número inteiro, fazer um programa que verifique se o número...");

              int[] arr = new int[] { 1, 3, 5};
              int n = 10;
              boolean is = false;

              for (int i : arr) {
                  if (i == n){
                    is = true;
                    break;
                  }
              }

              if(is){
                System.out.println(n + " esta presente no vetor");
              }else{
                System.out.println(n + " nao esta presente no vetor");
              }


    }
}
