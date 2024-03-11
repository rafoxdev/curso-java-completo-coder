package br.com.rafabueno.fundamentos.genericos;

/**
 * @author rafael-bueno
 * Desafio proposto pelo professor pra resolução de um exemplo de fórmula:
 * Usar um valor aleatório em FAHRENHEIT e descobrir seu valor em CELSIUS: (Fº - 32) x 5/9.0 = Cº
 */

public class DesafioTemperatura { // Declaração da classe "DesafioTemperatura"

    public static void main(String[] args) { // Método principal

        final double FATOR = 5 / 9.0; // Declaração da constante FATOR recebendo o valor da divisão armazenada
        final double AJUSTE = 32; // Declaração da constante AJUSTE e inicialização com o valor armazenado

        double fahrenheit = 94; // Declaração e inicialização da variável "fahrenheit" com o valor 94
        double celsius = (fahrenheit - AJUSTE) * FATOR; // Celsius recebe o valor do cálculo armazenado nele, atribuindo um novo valor a essa variável

        System.out.println("O resultado é: " + celsius + "Cº");
    }

}

/*
 * Para uso de constantes é comum utilizar letras maiúsculas como no exemplo desse código
 */

