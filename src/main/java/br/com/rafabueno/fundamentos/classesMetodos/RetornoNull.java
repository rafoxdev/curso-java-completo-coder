package br.com.rafabueno.fundamentos.classesMetodos;


public class RetornoNull {
    public static void main(String[] args) {

        String texto = ""; // Exemplo 1: Variável 'texto' não é 'null'
        System.out.println(texto.concat("Sou um bom programador!"));

        Data aniversario = null; // Exemplo 2: Variável 'aniversario' é inicializada como 'null'
        aniversario.ano = 1998; // Tentar acessar o atributo 'ano' resultará em uma exceção NullPointerException
    }
}

/**
 * - SOBRE NULL:
 *
 * - O 'null' é um valor especial que pode ser atribuído a variáveis de referência de objeto.
 * - Uma variável de referência 'null' não aponta para nenhum objeto na memória.
 * - Tentar acessar membros de um objeto 'null' resulta em uma exceção chamada: NullPointerException.
 *
 * - EXEMPLO 1: A variável 'texto' é uma String inicializada como uma string vazia.
 * - A operação 'concat' é realizada com sucesso porque 'texto' não é 'null'.

 * - EXEMPLO 2: A variável 'aniversario' é declarada como 'null'.
 * - Tentar acessar o atributo 'ano' resultará em NullPointerException, pois 'aniversario' não aponta para um objeto válido.
 *
 * - É crucial verificar se uma variável de referência é 'null' antes de tentar acessar seus membros para evitar exceções NullPointerException.
 *
 */
