package br.edu.univas;

public class questao_14 {

    public static void main(String[] args) {
        String originalString = "Exemplo de string com vogais em minúsculo";
        StringBuilder novaString = new StringBuilder();

        for (char c : originalString.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                novaString.append(Character.toUpperCase(c));
            } else {
                novaString.append(c);
            }
        }

        System.out.println(novaString);
    }
}

