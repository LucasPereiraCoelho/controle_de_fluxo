package ControleFluxo;

import POOaulas.OperacaoMatematica;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        OperacaoMatematica operacao = new OperacaoMatematica();

        System.out.println("Informe um valor: ");
        float valor = input.nextFloat();

        float rendimento = operacao.porcentagem(valor, 70);

        System.out.println("Seu dinheiro renderá " + rendimento + " ao mês e " + (rendimento * 12 + valor) + " ao ano.");

    }

}
