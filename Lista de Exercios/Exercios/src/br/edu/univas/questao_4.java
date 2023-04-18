package br.edu.univas;

public class questao_4 {

    public static void main(String[] args) {
        int[] numeros= new  int[6];
        int[] numeros_quadrado= new int[6];
        numeros[0] = 10;
        numeros[1] = 15;
        numeros[2] = 20;
        numeros[3] = 25;
        numeros[4] = 30;
        numeros[5] = 35;
        for(int x=0; x<6;x++){

            numeros_quadrado[x]= (int) Math.pow(numeros[x],2);
            System.out.println(numeros_quadrado[x]);
        }
    }
}
