package ControleFluxo;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor de um salário mínimo: ");
        double salarioMinimo = input.nextDouble();

        System.out.println("Informe o seu salário: ");
        double salario = input.nextDouble();

        System.out.println("Você recebe " + salario / salarioMinimo + " vezes um salário mínimo.");

    }

}
