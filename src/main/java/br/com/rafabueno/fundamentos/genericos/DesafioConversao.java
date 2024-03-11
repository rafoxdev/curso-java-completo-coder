package br.com.rafabueno.fundamentos.genericos;

import java.util.Scanner;

/**
 * Desafio proposto para aplicar na prática a conversão de tipo String para número.
 * Critérios do desafio:
 * - Usar o método Scanner para inserir a entrada do usuário.
 * - Permitir o uso de ',' ou '.' para separar as casas decimais.
 * - Usar como dados os 3 últimos salários informados pela pessoa.
 * - Calcular a média dos três salários informados.
 */
public class DesafioConversao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o primeiro salário: ");
        String valor1 = entrada.next().replace(",",".");

        System.out.println("Digite o segundo salario: ");
        String valor2 = entrada.next().replace(",", ".");

        System.out.println("Digite o terceiro salário: ");
        String valor3 = entrada.next().replace(",", ".");


        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);


        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A média dos 3 últimos salários é: " + media);

        entrada.close();

    }
}
