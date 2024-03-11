package br.com.rafabueno.fundamentos.arrays;


public class Foreach {

    public static void main(String[] args) {

        // Declaração e inicialização de um array de notas.
        double[] notas = {9.9, 8.7, 7.2, 9.4};

        // Loop tradicional utilizando um índice.
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " ");
        }

        System.out.println();

        for (double nota : notas) {
            System.out.println(nota + " ");
        }
    }
}

