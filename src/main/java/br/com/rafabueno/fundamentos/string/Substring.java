package br.com.rafabueno.fundamentos.string;

/**
 * Classe que demonstra o uso do método substring para obter partes de uma string em Java.
 */
public class Substring {

    /**
     * Método que retorna uma parte da string, começando de um índice até o final.
     *
     * @param texto String da qual a parte será obtida.
     * @param indice Índice do início da parte desejada.
     * @return Parte da string começando do índice até o final.
     */
    public static String obterParteDoFinal(String texto, int indice) {
        // Usando substring para obter uma parte da string do índice até o final
        return texto.substring(indice);
    }

    /**
     * Método principal para exemplificar o uso da classe Substring.
     *
     * @param args Argumentos da linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        // Exemplo: Obtenção de parte da string a partir de um índice
        String exemploTexto = "Hello, world!";
        String parteDaString = obterParteDoFinal(exemploTexto, 7);
        System.out.println("Parte da string a partir do índice 7: " + parteDaString);
    }
}
