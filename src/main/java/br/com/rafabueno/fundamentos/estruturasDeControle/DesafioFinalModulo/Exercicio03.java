package br.com.rafabueno.fundamentos.estruturasDeControle.DesafioFinalModulo;

import java.util.Scanner;

/**
 * DESAFIO: 3
 * - Criar um programa que receba duas notas parciais, e que calcule a média final.
 * - Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação"...
 * ...caso contrário imprime no console "Reprovado".
 */
public class Exercicio03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a primeira nota parcial: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Insira a segunda nota parcial: ");
        double nota2 = entrada.nextDouble();

        double mediaFinal = (nota1 + nota2) / 2;

        if(mediaFinal >= 7.0) {
            System.out.println("Aprovado");
        } else if (mediaFinal >= 4.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        entrada.close();
    }
}
