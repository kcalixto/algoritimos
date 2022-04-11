package com.kaua.at_class;

import java.util.Scanner;

public class april_fourth {
    public static void main(String[] args) {
        
        float n1, n2, n3, media, presence, recovery;
        int MAX_LACK = 18, MINIMUN_GRADE = 6;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = input.nextFloat();
        System.out.println("Digite a segunda nota: ");
        n2 = input.nextFloat();
        System.out.println("Digite a terceira nota: ");
        n3 = input.nextFloat();

        media = (n1 + n2 + n3) / 3;

        System.out.println("Digite a presença: ");
        presence = input.nextFloat();

        boolean haveMinimumGrade = media >= MINIMUN_GRADE;
        boolean haveMinimumPresence = presence >= MAX_LACK;

        if(haveMinimumGrade && haveMinimumPresence){
            System.out.println("Aprovado!");
        }else{
            if(!haveMinimumGrade){
                System.out.println("Suas notas não foram boas...");
                System.out.println("Qual sua nota de recuperação?");
                recovery = input.nextFloat();
                boolean haveMinimumRecoveryGrade = recovery > MINIMUN_GRADE;
                if(haveMinimumRecoveryGrade){
                    System.out.println("Parabéns, você foi aprovado!");
                }else{
                    System.out.println("Reprovado por nota :(");
                }
            }
            if(!haveMinimumPresence){
                System.out.println("Reprovado por falta :(");
            }
        
        }

    }
}
