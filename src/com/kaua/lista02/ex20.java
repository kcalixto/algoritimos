package com.kaua.lista02;

import java.util.Scanner;

public class ex20 {

  Scanner input = new Scanner(System.in);

  double saldoInicial, saldo, valor;
  String operacao, accountStatus;

  public final String depositar = "1";
  public final String sacar = "2";
  public final String sair = "3";

  public ex20() {
    System.out.println(
      "20. Escreva um programa capaz de ler o saldo inicial de uma conta bancária e um número indeterminado de operações de depósito e saque."
    );

    System.out.print("Digite o saldo atual da sua conta: ");
    saldoInicial = input.nextDouble();
    input.nextLine(); //clean
    saldo = saldoInicial;

    do {
      System.out.println("\nDigite qual operação deseja realizar: ");
      System.out.println(
        "(deposito = " +
        depositar +
        ", saque = " +
        sacar +
        ", encerrar = " +
        sair +
        ")"
      );
      operacao = input.nextLine();
      switch (operacao) {
        case sacar:
          System.out.print("\nOk, digite quanto deseja sacar: ");
          valor = input.nextDouble();
          saque(valor);
          break;
        case depositar:
          System.out.print("\nOk, digite quanto deseja depositar: ");
          valor = input.nextDouble();
          deposito(valor);
          break;
        case sair:
          if (saldo > 0) {
            accountStatus = "PREFERENCIAL";
          } else if (saldo == 0) {
            accountStatus = "ZERADA";
          } else {
            accountStatus = "ESTOURADA";
          }

          System.out.println("Obrigado pela sua visita! :)");
          saldo();
          System.out.println("\n CONTA " + accountStatus);
          break;
        default:
          System.out.println("Escolha uma das opções válidas");
          break;
      }
    } while (!operacao.equals(sair));
  }

  public void saldo() {
    System.out.println("Saldo atual " + saldo + "R$");
  }

  public void deposito(double valor) {
    System.out.println("Ok, foi depositado " + valor + "R$ em sua conta!");
    saldo += valor;
    saldo();
    input.nextLine(); //clean
  }

  public void saque(double valor) {
    System.out.println("Ok, foram sacados " + valor + "R$ de sua conta!");
    saldo -= valor;
    saldo();
    input.nextLine(); //clean
  }

  public static void main(String[] args) {
    new ex20();
  }
}
