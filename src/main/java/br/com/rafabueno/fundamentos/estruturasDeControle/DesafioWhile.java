package br.com.rafabueno.fundamentos.estruturasDeControle;

/*
    Nesse desafio fazendo a utilização do WHILE, a lógica utilizada deve calcular a média das notas de uma turma de alunos.
    O usuário deve digitar uma nota entre 0 e 10, sendo válida.
    Quando o usuário digitar a nota, ela deve ser armazenada em uma variável chamada "total" e sempre que uma nova nota for digitada deve acrescenta-lá a essa variável "total".
    E em outra variável, deve-se definir quantas notas validas foram digitadas. Nota x 1, nota y 2 e assim por diante.
    Devendo trazer o total de notas digitadas, quantas foram válidas, e por fim a média das notas válidas inseridas.
    E para sair, o usuário deve digitar "Sair".

 */

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota = 0;
        int qtdNotas = 0;
        double total = 0;


        while(nota != -1) {
            System.out.println("Informe a nota: ");
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0) {
                total += nota;
                qtdNotas++;
            } else if (nota != -1){
                System.out.println("Nota inválida!");
            }
        }

        // Calcular a média
        double media = total / qtdNotas;
        System.out.println("A média foi: " + media);

        entrada.close();
    }
}
