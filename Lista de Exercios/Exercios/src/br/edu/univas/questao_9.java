package br.edu.univas;

public class questao_9 {

        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {3, 4, 5, 6, 7};

            for (int num1 : array1) {
                boolean found = false;

                for (int num2 : array2) {
                    if (num1 == num2) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println(num1);
                }
            }

            for (int num2 : array2) {
                boolean found = false;

                for (int num1 : array1) {
                    if (num2 == num1) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println(num2);
                }
            }
        }
    }



