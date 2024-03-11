package br.com.rafabueno.fundamentos.estruturasDeControle.DesafioFinalModulo;

import java.util.Scanner;

/**
 * DESAFIO: 1
 * - Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par.
 */

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        double num = entrada.nextDouble();
        if (num <= 10 && num >= 0) {
            if (num % 2 == 0) {
                System.out.println("Você digitou um número par!");
            } else {
                System.out.println("Você digitou um número ímpar!");
            }
        } else {
            System.out.println("Você digitou um número inválido!");
        }
        entrada.close();
    }
}
