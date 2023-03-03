package ControleFluxo;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase/texto: ");
        String texto = input.nextLine();

        System.out.println("Seu texto possui " + texto.length() + " caracteres.");

    }

}
