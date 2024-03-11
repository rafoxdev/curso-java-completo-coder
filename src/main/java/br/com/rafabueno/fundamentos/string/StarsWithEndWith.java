package br.com.rafabueno.fundamentos.string;

/**
 * Classe que demonstra o uso dos métodos startsWith e endsWith para verificar prefixos e sufixos em strings em Java.
 */
public class StarsWithEndWith {

    /**
     * Método que verifica se uma string começa com um determinado prefixo.
     *
     * @param texto String a ser verificada.
     * @param prefixo Prefixo a ser verificado.
     * @return true se a string começa com o prefixo, false caso contrário.
     */
    public static boolean comecaComPrefixo(String texto, String prefixo) {
        return texto.startsWith(prefixo);
    }

    /**
     * Método que verifica se uma string termina com um determinado sufixo.
     *
     * @param texto String a ser verificada.
     * @param sufixo Sufixo a ser verificado.
     * @return true se a string termina com o sufixo, false caso contrário.
     */
    public static boolean terminaComSufixo(String texto, String sufixo) {
        return texto.endsWith(sufixo);
    }

    /**
     * Método principal para exemplificar o uso da classe StarsWithEndWith.
     *
     * @param args Argumentos da linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        // Exemplo: Verificação de prefixo e sufixo
        String exemploTexto = "Hello, world!";
        boolean comecaComHello = comecaComPrefixo(exemploTexto, "Hello");
        boolean terminaComWorld = terminaComSufixo(exemploTexto, "World");
        System.out.println("Começa com 'Hello'? " + comecaComHello);
        System.out.println("Termina com 'World'? " + terminaComWorld);
    }
}
