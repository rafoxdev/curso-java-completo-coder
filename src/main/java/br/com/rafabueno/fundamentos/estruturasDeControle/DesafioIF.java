package br.com.rafabueno.fundamentos.estruturasDeControle;

import java.util.Scanner;

/*
    Desafio: Construa um programa simples que solicite ao usuário dois números inteiros e, em seguida, determine e exiba qual deles é maior usando uma estrutura condicional if.
    Certifique-se de lidar com o caso em que os números são iguais.
 */
public class DesafioIF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double num1 = entrada.nextInt();

        System.out.println("Informe o segundo número: ");
        double num2 = entrada.nextInt();

        if(num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo");
        }
        if (num1 < num2) {
            System.out.println("O segundo numero é maior que o primeiro");
        }
        if (num1 == num2) {
            System.out.println("Os números são iguais");
        }

        entrada.close();

    }
}
