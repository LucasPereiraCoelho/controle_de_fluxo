package ControleFluxo;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String loginCerto = "lucas123";
        String senhaCerta = "lucas123";

        System.out.println("Informe seu login: ");
        String login = input.next();

        System.out.println("Informe a sua senha: ");
        String senha = input.next();

        if (loginCerto.equals(login) && senhaCerta.equals(senha)) {

            System.out.println("Usuário logado com sucesso");

        } else {

            System.out.println("Login ou senha inválidos");

        }

    }

}
