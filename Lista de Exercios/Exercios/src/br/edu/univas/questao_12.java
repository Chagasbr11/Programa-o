package br.edu.univas;

import java.util.Scanner;

public class questao_12 {

    public static void main(String[] args) {
        final int MAX_LENGTH = 40;
        Scanner sc = new Scanner(System.in);
        String palavra = "";

        while (palavra.isEmpty() || palavra.length() > MAX_LENGTH) {
            System.out.print("Digite uma palavra (até 40 caracteres): ");
            palavra = sc.nextLine();

            if (palavra.isEmpty()) {
                System.out.println("Palavra inválida. Tente novamente.");
            } else if (palavra.length() > MAX_LENGTH) {
                System.out.println("Palavra muito grande. Tente novamente.");
            } else {
                int qtd_faltante = MAX_LENGTH - palavra.length();
                String palavra_formatada = "_".repeat(qtd_faltante) + palavra;
                System.out.println("Palavra formatada: " + palavra_formatada);
            }
        }
        sc.close();
    }
}

