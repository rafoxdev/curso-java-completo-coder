package br.com.rafabueno.fundamentos.string;

/**
 * Classe que demonstra o uso do operador equals para comparação de strings em Java.
 */
public class Equals {

    /**
     * @param str1 Primeira string a ser comparada.
     * @param str2 Segunda string a ser comparada.
     * @return true se as strings são iguais, false caso contrário.
     */
    public static boolean compararStrings(String str1, String str2) {
        // Usando o operador equals para comparar strings
        return str1.equals(str2);
    }

    /**
     * Método principal para exemplificar o uso da classe Equals.
     *
     * @param args Argumentos da linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        // Exemplo 1: Strings iguais
        String exemplo1A = "Hello";
        String exemplo1B = "Hello";
        boolean resultado1 = compararStrings(exemplo1A, exemplo1B);
        System.out.println("Exemplo 1: As strings são iguais? " + resultado1);

        // Exemplo 2: Strings diferentes
        String exemplo2A = "Java";
        String exemplo2B = "Python";
        boolean resultado2 = compararStrings(exemplo2A, exemplo2B);
        System.out.println("Exemplo 2: As strings são iguais? " + resultado2);
    }
}

