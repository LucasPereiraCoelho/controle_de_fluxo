package ControleFluxo;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Random numSorteio = new Random();
        Scanner input = new Scanner(System.in);
        int contador = 0;
        int palpite = 0;

        int sorteio = numSorteio.nextInt(50);

        do {

            System.out.println("\nAdivinhe o palpite (0 a 50): ");
            palpite = input.nextInt();

            if (palpite > sorteio) {

                System.out.println("Menor que isso...");
                contador += 1;

            } else if (palpite < sorteio) {

                System.out.println("Maior que isso...");
                contador += 1;

            } else if (palpite == sorteio) {

                contador += 1;
                System.out.println("\nParabéns você acertou");
                System.out.println("Você precisou de " + contador + " tentativas.");

            }
        } while (palpite != sorteio);

    }

}
