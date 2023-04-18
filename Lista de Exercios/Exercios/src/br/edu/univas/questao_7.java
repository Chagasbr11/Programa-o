package br.edu.univas;

public class questao_7 {

    public static void main(String[] args) {

        int[] numeros = new int[6];
        int maior = 0;
        int menor = 0;
        numeros[0] = 10;
        numeros[1] = 15;
        numeros[2] = 20;
        numeros[3] = 25;
        numeros[4] = 30;
        numeros[5] = 35;

        for(int i = 0; i < 6; i++){
            if(i== 0){
                maior= numeros[i];
                menor= numeros[i];
            }
            if(numeros[i]>maior){
                maior= numeros[i];

            }else if(numeros[i]<menor){
                menor= numeros[i];

            }


        }
        System.out.println("maior= " + maior + " menor= "+ menor);


    }
}
