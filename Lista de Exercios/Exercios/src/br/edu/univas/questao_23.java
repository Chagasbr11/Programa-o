package br.edu.univas;

import java.util.Arrays;

public class questao_23 {

    public static void main(String[] args) {
        String input = "Esta é uma string de exemplo para ordenar as palavras por tamanho";
        String output = sortWordsByLength(input);
        System.out.println(output);
    }

    public static String sortWordsByLength(String input) {
        String[] words = input.split(" ");
        Arrays.sort(words, (a, b) -> b.length() - a.length());
        return String.join(" ", words);
    }
}

