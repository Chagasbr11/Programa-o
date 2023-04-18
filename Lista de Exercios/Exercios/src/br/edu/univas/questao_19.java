package br.edu.univas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class questao_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String inputString = scanner.nextLine();
        String outputString = removeOddOccurringChars(inputString);
        System.out.println("Resultado: " + outputString);
    }
    public static String removeOddOccurringChars(String inputString) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            int count = charCountMap.getOrDefault(c, 0);
            charCountMap.put(c, count + 1);
        }

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (charCountMap.get(c) % 2 == 0) {
                stringBuilder.append(c);
            }
        }

        return stringBuilder.toString();
    }
}

