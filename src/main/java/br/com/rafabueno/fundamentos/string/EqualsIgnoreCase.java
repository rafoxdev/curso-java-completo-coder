package br.com.rafabueno.fundamentos.string;

/**
 * Classe que demonstra o uso do método equalsIgnoreCase para comparar strings em Java.
 */
public class EqualsIgnoreCase {

    /**
     * Método que compara duas strings ignorando maiúsculas e minúsculas.
     *
     * @param str1 Primeira string a ser comparada.
     * @param str2 Segunda string a ser comparada.
     * @return true se as strings são iguais (ignorando caso), false caso contrário.
     */
    public static boolean compararSemCase(String str1, String str2) {
        // Usando equalsIgnoreCase para comparar strings ignorando caso
        return str1.equalsIgnoreCase(str2);
    }

    /**
     * Método principal para exemplificar o uso da classe EqualsIgnoreCase.
     *
     * @param args Argumentos da linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        // Exemplo: Comparação sem levar em conta maiúsculas ou minúsculas
        String exemplo1A = "Hello";
        String exemplo1B = "hello";
        boolean resultado = compararSemCase(exemplo1A, exemplo1B);
        System.out.println("As strings são iguais (ignorando caso)? " + resultado);
    }
}
