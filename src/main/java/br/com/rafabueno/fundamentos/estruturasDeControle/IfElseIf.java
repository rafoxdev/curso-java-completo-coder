package br.com.rafabueno.fundamentos.estruturasDeControle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida");
        } else if (nota >= 8.0) {
            System.out.println("Conceito A");
        } else if (nota >= 6.0) {
            System.out.println("Conceito B");
        } else if (nota >= 4.0) {
            System.out.println("Conceito C");
        } else if (nota >= 2.0) {
            System.out.println("Conceito D");
        } else if (nota >= 1.5) {
            System.out.println("Conceito E");
        }
    }
}
