package com.kaua.lista02;

import java.util.ArrayList;
import java.util.Scanner;

public class ex09 {

    public int oldestAge = 0;
    public int oldestIndex = 0;
    public ArrayList<String[]> students = new ArrayList<>();
    public Scanner input = new Scanner(System.in);

    public String name, grade;
    public int allGrades;
    public double avarageGrade;

    public int studentsAmount = 5;

    public ex09(){

        System.out.println("Quantos alunos existem? ");
        studentsAmount = input.nextInt();
        input.nextLine(); //absorb enter

        while (students.size() < studentsAmount){
            System.out.println("Aluno(a) "+ (students.size() + 1));
            System.out.print("Nome: ");
            name = input.nextLine();
            System.out.print("Nota: ");
            grade = input.nextLine();
            System.out.println("\n");

            avarageGrade = addStudent(name, Integer.parseInt(grade));
        } 

        System.out.println("Média de nota dos alunos: " + avarageGrade);
    }

    public double addStudent(String name, int grade){
        String[] student = new String[3];
        student[0] = name;
        student[1] = grade + ""; //simple String convertion
        
        students.add(student);
        double avg = calcGradeAvarage(grade, students.size());
        return avg;
    }

    public double calcGradeAvarage(int grade, int studentsAmount){
        allGrades+=grade;
        return (double) allGrades / studentsAmount;
    }

    public static void main(String[] args) {
        System.out.println("9. Escreva um programa para ler a quantidade de alunos existentes em uma turma.");
        new ex09();
    }
}
