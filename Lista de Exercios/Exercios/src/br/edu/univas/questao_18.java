package br.edu.univas;

import java.util.Scanner;

public class questao_18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String str = sc.nextLine();
        sc.close();

        String novaStr = duplicarVogais(str);

        System.out.println("A nova string com vogais duplicadas é: " + novaStr);
    }

    public static String duplicarVogais(String str) {
        StringBuilder novaStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                novaStr.append(c);
            }
            novaStr.append(c);
        }
        return novaStr.toString();
    }
}

