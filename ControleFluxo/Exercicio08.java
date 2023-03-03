package ControleFluxo;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma frase: ");
        String frase = input.nextLine();

        System.out.println("Escolha uma palavra dessa frase para ser alterada: ");
        String palavraEscolhida = input.nextLine();

        System.out.println("Por qual palavra ela deve ser alterada: ");
        String palavraAlterar = input.nextLine();

        System.out.println(frase.replaceAll(palavraEscolhida, palavraAlterar));

    }

}
