package com.kaua.lista02;

import java.util.ArrayList;
import java.util.Scanner;

public class ex06 {
    public int oldestAge = 0;
    public int oldestIndex = 0;
    public ArrayList<String[]> students = new ArrayList<>();
    public Scanner input = new Scanner(System.in);

    public String name, sex, age;

    private final int studentsAmount = 5;

    public ex06(){
        do {
            System.out.println("Aluno(a) "+ (students.size() + 1));
            System.out.print("Nome: ");
            name = input.nextLine();
            System.out.print("Idade: ");
            age = input.nextLine();
            System.out.print("Sexo: ");
            sex = input.nextLine();
            System.out.println("\n");

            addStudent(name, Integer.parseInt(age), sex);
        } while (students.size() < studentsAmount);

        System.out.println("Aluno(a) mais velho(a): ");
        for (String value : students.get(oldestIndex)) {
            System.out.println(value);
        }
    }

    public void addStudent(String name, int age, String sex){
        String[] student = new String[3];
        student[0] = name;
        student[1] = age + ""; //simple String convertion
        student[2] = sex;
        
        students.add(student);
        checkOldest(age, students.size() - 1);
    }

    public void checkOldest(int age, int index){
        if(age > oldestAge){
            oldestAge = age;
            oldestIndex = index;
        }
    }

    public static void main(String[] args) {
        System.out.println("6. Faça um programa para ler e escrever dados de uma turma de 5 alunos.");
        new ex06();
    }
}