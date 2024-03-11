package br.com.rafabueno.fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 7.0;
        String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação";

        System.out.println("O aluno está: " + resultadoFinal);

        int idade = 20;
        int status = (idade >= 18) ? 1 : 0;

        System.out.println(status);

    }
}

/*
    O operador ternário funciona da seguinte forma:

    condicao ? expressao_verdadeira : expressao_falsa

    condicao: É a expressão que será avaliada como verdadeira ou falsa.
    expressao_verdadeira: É o valor retornado se a condição for verdadeira.
    expressao_falsa: É o valor retornado se a condição for falsa.
 */
