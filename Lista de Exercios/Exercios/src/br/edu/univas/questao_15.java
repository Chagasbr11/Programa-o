package br.edu.univas;

import java.util.Scanner;

public class questao_15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine().replaceAll("[^0-9]", ""); // remove a pontuação

        if (cpf.length() != 11) {
            System.out.println("CPF inválido.");
        } else {
            int[] numeros = new int[11];
            for (int i = 0; i < 11; i++) {
                numeros[i] = Character.getNumericValue(cpf.charAt(i));
            }

            int soma1 = 0;
            int soma2 = 0;
            for (int i = 0; i < 9; i++) {
                soma1 += numeros[i] * (10 - i);
                soma2 += numeros[i] * (11 - i);
            }
            soma2 += numeros[9] * 2;

            int digito1 = 11 - (soma1 % 11);
            int digito2 = 11 - (soma2 % 11);

            if (digito1 > 9) digito1 = 0;
            if (digito2 > 9) digito2 = 0;

            if (numeros[9] == digito1 && numeros[10] == digito2) {
                System.out.println("CPF válido.");
            } else {
                System.out.println("CPF inválido.");
            }
        }

        scanner.close();
    }

}

