package br.com.rafabueno.fundamentos.classesMetodos;

/**
 * Em Java, quando você cria uma classe dentro de outra classe, isso é chamado de classe aninhada.
 * Existem dois tipos principais de classes aninhadas em Java:
 * 1 - classes estáticas aninhadas (também conhecidas como classes estáticas internas)
 * 2 - classes internas não estáticas (também conhecidas como classes internas).
 */

public class ConceitoDeClasses {

    /**
     * Uma classe estática aninhada é uma classe que é declarada como estática dentro de outra classe.
     * Ela é acessada usando o nome da classe externa, seguido por um ponto e o nome da classe interna. Por exemplo:
     */
    public static class ClasseAninhadaEstatica { // Criação de uma classe aninhada estática
    }
    ConceitoDeClasses.ClasseAninhadaEstatica objeto1 = new ConceitoDeClasses.ClasseAninhadaEstatica(); // Criando uma instância da classe aninhada estática


    /**
     * Uma classe interna não estática é uma classe que não é declarada como estática dentro de outra classe.
     * Ela tem acesso aos membros da classe externa, incluindo membros privados. Por exemplo:
     */
    public class ClasseAninhadaNaoEstatica { // Criação de uma classe aninhada NÃO estática
    }
    ConceitoDeClasses externa = new ConceitoDeClasses();  // Criando uma instância da classe aninhada NÃO estática
    ConceitoDeClasses.ClasseAninhadaNaoEstatica objeto2 = externa.new ClasseAninhadaNaoEstatica();

}

