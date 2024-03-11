package br.com.rafabueno.fundamentos.estruturasDeControle.DesafioFinalModulo;

import java.util.Scanner;

/**
 * DESAFIO: 4
 * - Criar um programa que receba um número e diga se ele é um número PRIMO.
 */

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        if (ehPrimo(numero)) {
            System.out.println("O número inserido é PRIMO.");
        } else {
            System.out.println("O número inserido não é PRIMO.");
        }
        entrada.close();
    }

    /**
     * @return Função para verificar se um número é PRIMO
     */
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Verificação Inicial: if (num <= 1)
 * Esta condição verifica se o número é menor ou igual a 1. Se for, o método retorna false. Números menores ou iguais a 1 não são considerados primos.
 *
 * Loop for para Verificar Divisibilidade: for (int i = 2; i <= Math.sqrt(num); i++)
 * Este loop começa com i igual a 2 e continua até a raiz quadrada de num.
 * A escolha da raiz quadrada é uma otimização para reduzir o número de iterações, pois se num for divisível por um número maior que sua raiz quadrada...
 * ...também será divisível por um número menor que a raiz quadrada.
 *
 * if (num % i == 0): Dentro do loop, verifica-se se num é divisível por i. Se for, o método retorna false, indicando que o número não é primo.
 *
 * Retorno true se Não Encontrar Divisores:s
 * Se o loop terminar sem encontrar nenhum divisor, o método retorna true, indicando que o número é primo.
 */

