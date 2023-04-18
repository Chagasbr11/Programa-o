package br.edu.univas;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o primeiro valor: ");
            double valor1 = scanner.nextDouble();

            System.out.print("Digite o segundo valor: ");
            double valor2 = scanner.nextDouble();

            System.out.print("Digite a operação (+, -, *, /): ");
            String operacao = scanner.next();

            double resultado;

            switch (operacao) {
                case "+" -> resultado = valor1 + valor2;
                case "-" -> resultado = valor1 - valor2;
                case "*" -> resultado = valor1 * valor2;
                case "/" -> resultado = valor1 / valor2;
                default -> {
                    System.out.println("Operação inválida.");
                    continue;
                }
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja efetuar mais algum cálculo? (S/N) ");
            String opcao = scanner.next();

            if (opcao.equalsIgnoreCase("N")) {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }

}

