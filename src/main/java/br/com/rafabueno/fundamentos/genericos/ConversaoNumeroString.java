package br.com.rafabueno.fundamentos.genericos;

public class ConversaoNumeroString {
    public static void main(String[] args) {

        // Conversão de Integer para String usando o método toString()
        Integer num1 = 10000;
        System.out.println(num1.toString().length()); // Obtém o comprimento da String

        // Conversão de int para String usando o método estático toString() da classe Integer
        int num2 = 100000;
        System.out.println(Integer.toString(num2).length()); // Obtém o comprimento da String

        // Conversão usando concatenação com uma string vazia
        System.out.println(("" + num1).length()); // Concatenação para converter para String e obtém o comprimento
        System.out.println(("" + num2).length());
    }
}

/*
 * Esses métodos ilustram diferentes maneiras de converter números para String em Java.
 * O uso de toString() em objetos e a concatenação com uma String vazia são maneiras comuns de realizar essa conversão.
 *
 * Na conversão na linha 12 a variável num2 foi declarada como tipo primitivo int, pra conversão é preciso passar o Wrapper desse tipo, que nesse caso o Integer.
 */
