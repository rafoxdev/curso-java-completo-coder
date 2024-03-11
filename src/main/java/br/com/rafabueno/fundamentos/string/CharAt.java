package br.com.rafabueno.fundamentos.string;

/**
 * Classe que demonstra o uso do método charAt para obter caracteres em uma posição específica de uma string em Java.
 */
public class CharAt {

    /**
     * Método que retorna o caractere em uma posição específica da string.
     *
     * @param palavra String da qual o caractere será obtido.
     * @param indice Índice da posição do caractere desejado.
     * @return Caractere na posição especificada.
     */
    public static char obterCaractere(String palavra, int indice) {
        // Usando charAt para obter um caractere em uma posição específica
        return palavra.charAt(indice);
    }

    /**
     * Método principal para exemplificar o uso da classe CharAt.
     */
    public static void main(String[] args) {
        // Exemplo: Obtenção de caractere em uma posição específica
        String exemploPalavra = "Java";
        char terceiroCaractere = obterCaractere(exemploPalavra, 2); // Lembrando que o indice inicia em 0.
        System.out.println("Terceiro caractere: " + terceiroCaractere);
    }
}
