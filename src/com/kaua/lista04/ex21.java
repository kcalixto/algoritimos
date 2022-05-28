package com.kaua.lista04;

public class ex21 {
    public static void main(String[] args) {
        // 21. Fazer um programa que lê o nome e a nota de cada aluno de uma sala de
        // aula. O programa deve calcular e imprimir a média da sala e os nomes dos
        // alunos que tiveram notas acima da média. Sugestão: utilizar um vetor para os
        // nomes e outro para as notas.

        System.out.println(
                "21. Fazer um programa que lê o nome e a nota de cada aluno de uma sala de aula. O programa deve calcular e imprimir a média da sala e os nomes dos alunos que tiveram notas acima da média. Sugestão: utilizar um vetor para os nomes e outro para as notas.");

        String[] alunoNames = new String[] { "kaua", "outro kaua", "auak" };
        int[] alunoNotas = new int[] { 10, 10, 6 };

        int mediaSala = 0;
        String alunosMediaBoa = "";

        for (int i = 0; i < alunoNotas.length; i++) {
            mediaSala += alunoNotas[i];
        }
        mediaSala /= alunoNotas.length;

        for (int i = 0; i < alunoNotas.length; i++) {
            if (alunoNotas[i] > mediaSala) {
                if (i == alunoNotas.length - 1) {
                    alunosMediaBoa += alunoNames[i];
                }
                alunosMediaBoa += ", " + alunoNames[i];
            }
        }

        System.out.println("Média da sala: " + mediaSala);
        System.out.println("Alunos com nota acima da média da sala: " + alunosMediaBoa);

    }
}