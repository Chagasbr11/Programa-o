package br.edu.univas;

public class questao_10 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] distinctArray = getDistinctArray(array1, array2);
        printDistinctNumbers(distinctArray);
    }

    public static int[] getDistinctArray(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int i = 0;
        for (int num : array1) {
            result[i++] = num;
        }
        for (int num : array2) {
            result[i++] = num;
        }
        int count = 0;
        for (i = 0; i < result.length; i++) {
            boolean duplicate = false;
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                count++;
            }
        }
        int[] distinctArray = new int[count];
        count = 0;
        for (i = 0; i < result.length; i++) {
            boolean duplicate = false;
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                distinctArray[count++] = result[i];
            }
        }
        return distinctArray;
    }

    public static void printDistinctNumbers(int[] distinctArray) {
        System.out.println("Números distintos em ordem crescente:");
        for (int num : distinctArray) {
            System.out.println(num);
        }
        System.out.println("Total de números distintos: " + distinctArray.length);
    }
}





