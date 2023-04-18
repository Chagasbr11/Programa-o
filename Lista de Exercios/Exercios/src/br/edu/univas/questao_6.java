package br.edu.univas;

import java.util.Scanner;

public class questao_6 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int[] numeros =new int[10];
        int pares=0;
        int impares=0;
        for (int x= 0; x<10;x++){
            System.out.println("digite um numero entre 0 e 1000");
            numeros[x]= Scanner.nextInt();
        }
        for(int i=0; i <10;i++){
            if ((numeros[i]% 2==0)){
                pares++;
            }else {
                impares++;

            }
        }
        System.out.println(pares + " pares " + impares + " impares");
    }

    }
