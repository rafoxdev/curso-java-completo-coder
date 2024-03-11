package br.com.rafabueno.fundamentos.arrays;

import java.util.Arrays;

public class ConceitoArrays {
    public static void main(String[] args) {

        double [] notaAlunoA = new double [4];

        notaAlunoA[0] = 7.5;
        notaAlunoA[1] = 6.0;
        notaAlunoA[2] = 9.5;
        notaAlunoA[3] = 8.0;

        System.out.println(Arrays.toString(notaAlunoA));

        double totalAlunoA = 0;
        for(int i = 0; i < notaAlunoA.length; i++) {
            totalAlunoA += notaAlunoA[i];
        }
        System.out.println(notaAlunoA[0]); // Acessa o valor armazenado na primeira posição do Array
        System.out.println(notaAlunoA[notaAlunoA.length - 1]); // Acessa o valor armazenado na última posição do Array notaAlunoA.


        double [] notaAlunoB = {6.5, 9.0, 6.8, 7.5}; // Inicializando as notas diretamente no Array, a partir de valores literais.

        System.out.println(Arrays.toString(notaAlunoB));

        double totalAlunoB = 0;
        for(int i = 0; i < notaAlunoB.length; i++) {
            totalAlunoB += notaAlunoB[i];
        }
        System.out.println(notaAlunoB[0]);
        System.out.println(notaAlunoB[notaAlunoB.length - 1]);


    }
}

/**
 * - SOBRE ARRAYS:
 *
 * - Em programação, um array é uma estrutura de dados que permite armazenar elementos do mesmo tipo sob um mesmo nome.
 * - Cada elemento é acessado por meio de um índice, que representa sua posição no array.
 * - Os arrays em Java são objetos que podem conter dados primitivos ou referências a objetos.
 *
 * - UTILIZAÇÕES USADAS:
 *
 * - Armazenamento de Conjuntos de Dados: Eles são úteis para armazenar coleções de dados do mesmo tipo, como notas de estudantes, registros de funcionários, etc.
 * - Manipulação de Dados: São amplamente usados para ordenar, buscar e realizar operações em conjuntos de dados.
 * - Acesso Eficiente: O acesso aos elementos de um array é rápido e direto usando índices.
 */
