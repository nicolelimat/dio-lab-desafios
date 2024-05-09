package edu.dio;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite a Agência !");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo !");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}