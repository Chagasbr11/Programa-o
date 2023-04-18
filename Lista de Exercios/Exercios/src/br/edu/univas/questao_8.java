package br.edu.univas;

public class questao_8 {


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.print("Números iguais: ");
        for (int j : array1) {
            for (int k : array2) {
                if (j == k) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}


