package br.edu.univas;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class questao_25 {

    public static void main(String[] args) {
        String texto = "Um exemplo de texto com algumas palavras como um, uma, de, com, etc.";

        Set<String> ignorar = new HashSet<>(Arrays.asList("um", "uma", "uns", "umas", "de", "da", "do", "das", "dos", "com", "sem", "por", "para", "em", "na", "no", "nas", "nos", "sobre", "sob", "entre", "debaixo", "acima", "através", "à", "ao", "às", "aos"));

        String[] palavras = texto.split("\\s+"); // divide o texto em palavras
        Arrays.sort(palavras, (a, b) -> {
            if (ignorar.contains(a.toLowerCase())) {
                return 1;
            } else if (ignorar.contains(b.toLowerCase())) {
                return -1;
            } else {
                return a.compareToIgnoreCase(b);
            }
        });

        String resultado = String.join(" ", palavras);

        System.out.println(resultado);
    }

}


