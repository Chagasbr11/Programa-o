package br.edu.univas;

import java.util.Scanner;

public class questao_24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código da CNH: ");
        String cnh = scanner.nextLine();

        if (cnh.matches("[0-9]{9}[A-Z]{2}[0-9]{2}")) {
            System.out.println("CNH válida!");
        } else {
            System.out.println("CNH inválida!");
        }
    }

}

