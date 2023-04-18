package br.edu.univas;

import java.util.HashSet;
import java.util.Scanner;

public class questao_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String inputString = sc.nextLine();
        sc.close();

        HashSet<Character> uniqueChars = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
                result.append(c);
            }
        }

        System.out.println("String sem letras duplicadas: " + result);
    }
}

