package br.edu.univas;

public class questao_5 {

    public static void main(String[] args) {
        int[] numeros =new int[100];
        for (int x= 0; x<100;x++){
            numeros[x]=x;
        }
        for(int i=0; i <100;i++){
            int divisores =0;
            for(int j= 1; j<100;j++){
              if((numeros[i]%j)==0){
                  divisores++;

              }
            }
           if(divisores==2){
               System.out.println(numeros[i]+" é primo");
           }

        }
    }

}
