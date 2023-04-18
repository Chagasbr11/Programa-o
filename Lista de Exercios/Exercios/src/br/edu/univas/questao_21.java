package br.edu.univas;

import java.util.HashMap;

public class questao_21 {

    public static void main(String[] args) {
        String input = "aabbcddd";
        String output = groupRepeatedLetters(input);
        System.out.println(output);
    }
    public static String groupRepeatedLetters(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                if (charCount.size() > 0) {
                    for (Character key : charCount.keySet()) {
                        output.append(key);
                        if (charCount.get(key) > 1) {
                            output.append("(").append(charCount.get(key)).append(")");
                        }
                    }
                    charCount.clear();
                }
                charCount.put(c, 1);
            }
        }
        if (charCount.size() > 0) {
            for (Character key : charCount.keySet()) {
                output.append(key);
                if (charCount.get(key) > 1) {
                    output.append("(").append(charCount.get(key)).append(")");
                }
            }
        }
        return output.toString();
    }
}

