package br.com.rafabueno.fundamentos.genericos;

import java.util.Scanner; // Importa a classe Scanner para utilizá-la na leitura de dados do teclado

public class EntradaConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria uma instância de Scanner para ler dados do console

        System.out.print("Digite seu nome: "); // Solicita ao usuário que digite seu nome
        String nome = scanner.nextLine(); // Lê uma linha de texto digitada pelo usuário

        System.out.print("Digite sua idade: "); // Solicita ao usuário que digite sua idade
        int idade = scanner.nextInt(); // Lê um número inteiro digitado pelo usuário

        // Exibe os dados inseridos pelo usuário no console
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);

        scanner.close(); // Fecha o Scanner após a leitura dos dados
    }
}
