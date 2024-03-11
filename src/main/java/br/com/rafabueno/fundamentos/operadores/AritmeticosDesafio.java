package br.com.rafabueno.fundamentos.operadores;

/**
 * Esta classe resolve um desafio aritmético.
 * O desafio consiste em realizar uma série de operações matemáticas e calcular um resultado final.
 */
public class AritmeticosDesafio {

    /**
     * Método principal que inicia o programa.
     * Realiza uma série de cálculos de acordo com as instruções do desafio e imprime o resultado.
     */
    public static void main(String[] args) {

        // Calcula o numerador A: (6 * (3 + 2))^2
        double numA = Math.pow(6 * (3 + 2), 2);
        // Calcula o denominador A: 3 * 2
        double denA = 3 * 2;

        // Calcula o numerador B: (1 - 5) * (2 - 7)
        double numB = (1 - 5) * (2 - 7);
        // Define o denominador B como 2
        double denB = 2;

        // Calcula o valor superior A: numerador A / denominador A
        double superiorA = numA / denA;
        // Calcula o valor superior B: (numerador B / denominador B)^2
        double superiorB = Math.pow(numB / denB, 2);

        // Calcula o valor da parte superior da fração: (superiorA - superiorB)^3
        double superior = Math.pow(superiorA - superiorB, 3);
        // Define o valor do denominador como 10^3
        double inferior = Math.pow(10, 3);

        // Calcula o resultado final da expressão: superior / inferior
        double resultado = superior / inferior;

        // Imprime o resultado final na tela
        System.out.println("O resultado é: " + resultado);
    }
}

