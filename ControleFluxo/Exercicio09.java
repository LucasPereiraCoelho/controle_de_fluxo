package ControleFluxo;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos cavalos existem no haras: ");
        int cavalos = input.nextInt();

        System.out.println("Serão necesárias " + cavalos * 4 + " ferraduras para equipar todos os cavalos do haras.");

    }

}
