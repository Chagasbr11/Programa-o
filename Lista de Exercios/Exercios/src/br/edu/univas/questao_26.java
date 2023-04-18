package br.edu.univas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class questao_26 {

    public static void main(String[] args) {
        List<String> palavrasPermitidas = Arrays.asList("casa", "carro", "telefone");
        String input = "Eu moro em uma casa e tenho um carro.";

        String resultado = Arrays.stream(input.split(" "))
                .filter(palavrasPermitidas::contains)
                .collect(Collectors.joining(" "));

        System.out.println(resultado);
    }
}

