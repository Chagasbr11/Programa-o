package br.edu.univas;

import java.util.Scanner;

public class questao_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma data no formato dd/mm/yyyy: ");
        String dataStr = scanner.nextLine();

        String[] dataArr = dataStr.split("/");
        int dia = Integer.parseInt(dataArr[0]);
        int mes = Integer.parseInt(dataArr[1]);
        int ano = Integer.parseInt(dataArr[2]);

        String[] meses = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        String dataPorExtenso = dia + " de " + meses[mes] + " de " + ano;
        System.out.println(dataPorExtenso);
    }
}

