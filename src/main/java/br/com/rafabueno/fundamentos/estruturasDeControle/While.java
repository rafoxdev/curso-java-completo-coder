package br.com.rafabueno.fundamentos.estruturasDeControle;

public class While {
    public static void main(String[] args) {

        int contador = 1; // Inicializa um contador com o valor 1

        while (contador <= 20) { // Utiliza um loop while para iterar de 1 a 20
            System.out.printf("i = %d\n", contador); // Imprime o valor atual do contador
            contador++; // Incrementa o contador para a próxima iteração
        }
    }
}

