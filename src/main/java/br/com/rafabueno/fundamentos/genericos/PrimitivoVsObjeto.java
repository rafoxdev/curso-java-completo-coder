package br.com.rafabueno.fundamentos.genericos;

/**
 * Demonstração da diferença entre tipos primitivos e objetos em Java.
 * Tipos primitivos são valores diretos, enquanto objetos são instâncias de classes.
 */
public class PrimitivoVsObjeto {

    public static void main(String[] args) {

        // Exemplo de objeto: String é uma classe em Java
        String s = new String("texto");
        s.toLowerCase(); // Métodos podem ser chamados em objetos

        // Exemplo de tipo primitivo: int é um tipo de dado fundamental
        int a = 123;
        System.out.println(a); // Não é possível chamar métodos em tipos primitivos

    }

}

