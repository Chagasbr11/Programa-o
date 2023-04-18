package br.edu.univas;

import java.util.Scanner;

public class questao_20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = sc.nextLine();
        String output = transformString(input);
        System.out.println("Resultado: " + output);
    }

    public static String transformString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i % 2 == 0) { // posição par
                sb.append(Character.toLowerCase(c));
            } else { // posição ímpar
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}

