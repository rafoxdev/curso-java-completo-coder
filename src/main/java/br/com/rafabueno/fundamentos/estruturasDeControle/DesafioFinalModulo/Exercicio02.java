package br.com.rafabueno.fundamentos.estruturasDeControle.DesafioFinalModulo;

import java.util.Scanner;

/**
 * DESAFIO: 2
 * - Criar um programa que informe se o ano atual é um ano bissexto.
 */

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um ano de 0 a 2024: ");
        int ano = entrada.nextInt();

        if(ano >= 0 && ano <= 2024) {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println("O ano inserido é um ano bissexto");
            } else {
                System.out.println("O ano inserido NÃO é um ano bissexto");
            }
        } else {
            System.out.println("Ano inserido fora do intervalo válido");
        }
        entrada.close();
    }

}
/**
 * ano % 4 == 0: Isso verifica se o ano é divisível por 4. Isso é a condição básica para um ano ser bissexto, pois a cada 4 anos...
 * ...adicionamos um dia ao calendário para compensar o tempo extra que a Terra leva para orbitar o Sol.
 *
 * ano % 100 != 0: Esta parte da condição verifica se o ano não é divisível por 100. A exceção à regra dos anos bissextos ocorre a cada 100 anos.
 * Se um ano for divisível por 100, mas não por 400, ele não é bissexto. Por exemplo, 1900 não é bissexto, mas 2000 é.
 *
 * (ano % 400 == 0): Esta parte adiciona uma exceção à exceção. Se o ano for divisível por 400, ele é bissexto, mesmo sendo divisível por 100.
 * Isso é feito para compensar as exceções a cada 100 anos mencionadas acima. Por exemplo, 1600 e 2000 são bissextos, apesar de serem divisíveis por 100.
 *
 * Portanto, a condição completa pode ser lida assim: "Se o ano for divisível por 4 e não for divisível por 100 OU se for divisível por 400, então é um ano bissexto.
 * Essa é uma representação da regra usada para determinar anos bissextos no calendário gregoriano.
 */