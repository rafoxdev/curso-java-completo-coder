package br.com.rafabueno.fundamentos.estruturasDeControle;

/*
    O for é especialmente útil quando se deseja executar um bloco de código um número específico de vezes

    for (inicialização; condição; expressão de atualização)

    Inicialização: É a parte onde você inicializa a variável de controle do loop. Ela é executada apenas uma vez, no início do loop.
    Condição: É a expressão booleana que determina se o bloco de código dentro do loop deve ser executado. Enquanto a condição for verdadeira, o loop continuará a ser executado.
    Expressão de Atualização: É a expressão que é executada após cada iteração do loop. Geralmente, é usada para incrementar ou decrementar a variável de controle.

 */

public class For {
    public static void main(String[] args) {

        for (int contador = 0; contador <= 20; contador++) {
            System.out.printf("i = %d\n", contador);
        }
    }

}
