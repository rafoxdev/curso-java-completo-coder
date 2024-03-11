package br.com.rafabueno.fundamentos.estruturasDeControle;

/*
    Exemplo de utilização de um FOR sob FOR
 */

public class For3 {

    public static void main(String[] args) {

        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.printf("[%d %d]", a, b);
            }
        }
    }
}
