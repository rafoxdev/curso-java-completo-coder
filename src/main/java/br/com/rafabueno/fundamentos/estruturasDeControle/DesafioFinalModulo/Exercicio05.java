package br.com.rafabueno.fundamentos.estruturasDeControle.DesafioFinalModulo;

import java.util.Scanner;

/**
 * DESAFIO: 4
 * - 5. Refatorar o exercício 04, utilizando a estrutura switch.
 */
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = entrada.nextInt();

        switch (verificaNumPrimo(numero)) {
            case 01:
                System.out.println("O número inserido é PRIMO");
                break;
            case 02:
                System.out.println("O número inserido NÃO é primo");
        }
        entrada.close();
    }

    public static int verificaNumPrimo(int num) {
        if(num <= 1) {
            return 0; // Descarta, pois o número NÃO é primo.
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0; // // Número continua não sendo primo
            }
        }
        return 1;
    }
}

/**
 * O método verificaNumPrimo recebe um número como parâmetro (num) e verifica se ele é primo ou não.
 * Se o número for menor ou igual a 1, é considerado que não é primo.
 * Caso contrário, é utilizado um loop para verificar se o número é divisível por algum outro número entre 2 e a raiz quadrada do próprio número. Se for divisível, o número não é primo.
 * Se nenhum divisor é encontrado, o número é considerado primo.
 */
