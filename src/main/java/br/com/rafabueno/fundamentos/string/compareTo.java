package br.com.rafabueno.fundamentos.string;

/**
 * Classe que demonstra o uso do método compareTo para comparar strings lexicograficamente em Java.
 */
public class compareTo {

    /**
     * Método que compara duas strings lexicograficamente.
     *
     * @param str1 Primeira string a ser comparada.
     * @param str2 Segunda string a ser comparada.
     * @return Valor negativo se str1 < str2, zero se str1 é igual a str2, valor positivo se str1 > str2.
     */
    public static int compararLexicograficamente(String str1, String str2) {
        // Usando compareTo para comparar strings lexicograficamente
        return str1.compareTo(str2);
    }

    /**
     * Método principal para exemplificar o uso da classe compareTo.
     */
    public static void main(String[] args) {
        // Exemplo: Comparação lexicográfica
        String exemplo2A = "apple";
        String exemplo2B = "banana";
        int resultado = compararLexicograficamente(exemplo2A, exemplo2B);
        System.out.println("Resultado da comparação lexicográfica: " + resultado);
    }
}
