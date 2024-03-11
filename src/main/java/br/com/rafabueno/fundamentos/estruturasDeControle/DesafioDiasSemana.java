package br.com.rafabueno.fundamentos.estruturasDeControle;

import java.util.Scanner;

/*
    A proposta do desafio é printar os respectivos números correspondetes ao dia da semana inserido pelo usuário

    EX:

    Domingo: 1
    Segunda: 2
    Terça: 3
    Quarta: 4
    Quinta: 5
    Sexta: 6
    Sábado: 7
 */
public class DesafioDiasSemana {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira um dia da semana: ");
        String valor = teclado.nextLine();

        if(valor.equalsIgnoreCase("Domingo")) {
            System.out.println(1);
        } else if (valor.equalsIgnoreCase("Segunda")) {
            System.out.println(2);
        } else if (valor.equalsIgnoreCase("Terca")) {
            System.out.println(3);
        } else if (valor.equalsIgnoreCase("Quarta")) {
            System.out.println(4);
        } else if (valor.equalsIgnoreCase("Quinta")) {
            System.out.println(5);
        } else if(valor.equalsIgnoreCase("Sexta")) {
            System.out.println(6);
        } else if (valor.equalsIgnoreCase("Sabado")) {
            System.out.println(7);
        } else {
            System.out.println("Dia inválido");
        }

        teclado.close();

    }
}
