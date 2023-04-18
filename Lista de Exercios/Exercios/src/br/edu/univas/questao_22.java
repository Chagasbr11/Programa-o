package br.edu.univas;

import java.util.Arrays;
import java.util.Scanner;

public class questao_22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();
        String strOrdenada = ordenarString(str);
        System.out.println("String ordenada: " + strOrdenada);
    }
    public static String ordenarString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}

