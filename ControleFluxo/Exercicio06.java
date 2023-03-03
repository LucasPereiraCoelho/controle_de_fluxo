package ControleFluxo;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para saber a sua tabuada: ");
        int num = input.nextInt();

        for (int mult = 1; mult <= 10; mult++) {

            System.out.println(num + " x " + mult + " = " + num * mult);

        }

    }
}
