package br.com.rafabueno.fundamentos.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @class O conceito de Matriz bidimensional, é um array de arrays.
 */
public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdNotas = entrada.nextInt();

        // Declaração e inicialização da matriz para armazenar as notas da turma.
        double [] [] notasDaTurma = new double [qtdAlunos][qtdNotas];

        double total = 0;
        for(int alunos = 0; alunos < notasDaTurma.length; alunos++) {
            for (int notas = 0; notas < notasDaTurma[alunos].length; notas++) {
                System.out.printf("Informe a nota %d do aluno %d: ", notas + 1, alunos +1);
                notasDaTurma[alunos] [notas] = entrada.nextDouble();
                total += notasDaTurma [alunos] [notas];
            }
        }

        double mediaNotas = total / (qtdAlunos * qtdNotas);
        System.out.println("A média da turma é: " + mediaNotas);

        for(double [] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDaTurma));
        }
        entrada.close();

    }
}

/**
 * - CONCEITO DE MATRIZ:
 *
 * - Em Java, assim como em muitas outras linguagens de programação, uma matriz é uma estrutura de dados bidimensional que permite organizar dados em linhas e colunas.
 * - Pode-se pensar em uma matriz como um "array de arrays". Cada elemento em uma matriz pode ser acessado através de dois índices: um para a linha e outro para a coluna.
 *
 * - Declaração e Inicialização:
 * - Você pode declarar e inicializar uma matriz em uma única linha, como no exemplo acima. O tamanho da matriz é determinado pelo número de elementos nas chaves internas.
 *
 * - Acesso a Elementos:
 * - Utilize dois conjuntos de colchetes para acessar elementos em uma matriz. O primeiro índice representa a linha e o segundo a coluna.
 *
 * - Matrizes Irregulares:
 * - Em Java, as matrizes não precisam ter todas as linhas com o mesmo comprimento. Isso permite a criação de matrizes irregulares, embora seja comum utilizar matrizes regulares.
 */
