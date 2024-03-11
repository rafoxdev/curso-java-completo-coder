package br.com.rafabueno.fundamentos.estruturasDeControle;

/**
 * @see Esse exemplo mostra a utilização do BREAK dentro de um IF em um laço FOR.
 * @see O momento que o for executar a iteração sobre o número 5, ele encerra e sai.
 */
public class Break {
    public static void main(String[] args) {

        for (int i =0; i < 10; i++) {
            if (i == 5) {
                break;
            }
        }
        System.out.println("FIM");
    }
}
