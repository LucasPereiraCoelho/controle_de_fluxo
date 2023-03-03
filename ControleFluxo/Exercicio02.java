package ControleFluxo;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String palavra = "";

        do {

            System.out.println("Digite algo para recebe-lo invertido: ");
            palavra = input.next();

        } while (palavra.length() < 2);

        char[] toCharArray = palavra.toCharArray();

        for (int a = toCharArray.length - 1; a >= 0; a--) {

            System.out.print(toCharArray[a]);

        }

    }

}
