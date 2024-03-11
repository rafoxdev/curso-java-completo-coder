package br.com.rafabueno.fundamentos.arrays;

import java.util.Scanner;


public class DesafioArrays {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas são? ");
        int qtdNotas = entrada.nextInt();

        // Declaração e inicialização do array para armazenar as notas.
        double[] notas = new double[qtdNotas];

        // Loop para obter as notas do usuário e armazená-las no array.
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;

        // Loop "for-each" para percorrer cada elemento (nota) do array de notas.
        for (double nota : notas) {
            total += nota; // Acumula cada nota ao total, somando-a ao valor atual de total.
        }

        double media = total / notas.length;
        System.out.println("A média é: " + media + "!");

        entrada.close();
    }
}

