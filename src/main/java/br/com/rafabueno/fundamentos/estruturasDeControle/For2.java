package br.com.rafabueno.fundamentos.estruturasDeControle;

/*
    Esse exemplo de uso do FOR mostra como decrementar do 10 ao 0 fazendo isso de 2 em 2
 */

public class For2 {
    public static void main(String[] args) {

        for(int contador = 10; contador >= 0; contador -= 2) {
            System.out.printf("Contador = %d\n", contador);
        }
    }
}
