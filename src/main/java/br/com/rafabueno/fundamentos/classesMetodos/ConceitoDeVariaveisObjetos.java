package br.com.rafabueno.fundamentos.classesMetodos;

public class ConceitoDeVariaveisObjetos {
    int idade; // Atributo da classe do tipo int
    String nome; // Variável inicializada globalmente, contendo o valor null. (Pois String é um atributo de classe e por padrão como está global atribui-se NULL ao seu contéudo).

    public void exemploMetodo() { // Método que utiliza variáveis locais
        int anoNascimento = 2000; // Variável local do tipo int
        String cidade = "Curitiba"; // Variável cidade é do tipo String, que também é um tipo de objeto.
    }
}

/**
 * DIFERENÇA ENTRE VARIÁVEIS E ATRIBUTOS:
 *
 * Variáveis:
 *
 * Geralmente, o termo "variável" é usado para se referir a uma localização de armazenamento nomeada que pode conter um valor.
 * Em Java, você declara variáveis para armazenar dados temporários durante a execução do programa.
 * Variáveis podem ser locais (definidas em métodos ou blocos) ou globais (definidas no escopo de uma classe).
 * Variáveis podem ser de tipos primitivos (int, double, boolean, etc.) ou objetos (String, List, etc.).
 *
 * Atributos:
 *
 * O termo "atributo" geralmente está associado a objetos e classes em programação orientada a objetos.
 * Em Java, atributos são variáveis que pertencem a uma classe e descrevem características ou propriedades dos objetos dessa classe.
 * Atributos são muitas vezes chamados de "membros de dados" ou "campos" de uma classe.
 * Cada instância (objeto) da classe possui seus próprios valores para esses atributos.
 *
 */

/**
 * - SOBRE VARIÁVEIS:
 *
 * - Quando declara-se uma variável como global, ou seja no escopo da classe. Ela inicializa-se com valores padrões, são eles:
 *
 * - INT, LONG, BYTE, SHORT = 0
 * - FLOAT, DOUBLE = 0.0
 * - CHAR = '\000' (tem a letra u depois da barra invertida)
 * - BOOLEAN = FALSE
 *
 * - Tirando esses citados acima, o restante são objetos.
 * - Quando a variável é declarada localmente ou em construtores, ela não inicializa sozinha por padrão como é feito globalmente.
 */


/**
 * - SOBRE OBJETOS (ATRIBUTOS DE CLASSES):
 *
 * - Quando um objeto é declarado globalmente (no escopo da classe), ele é inicializado com o valor padrão 'NULL'.
 *   Exemplo: String, List, Map, etc.
 *
 * - Exceções a essa regra são os tipos primitivos que são objetos (como Integer, Double, etc.), que são inicializados
 *   com seus valores padrões, como explicado anteriormente.
 *
 * - Se um objeto é declarado localmente (em métodos ou construtores), ele não é inicializado automaticamente
 *   e deve ser explicitamente instanciado antes de ser usado. Exemplo:
 *
 * - String nome; inicializado com null
 * - List<Integer> numeros; inicializado com null
 * - int[] arrayDeInteiros; inicializado com null * A referência ao array é null, não os elementos.
 *
 * - Ao tentar acessar um objeto não inicializado (null), ocorrerá um NullPointerException.
 */

