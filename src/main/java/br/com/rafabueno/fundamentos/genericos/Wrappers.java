package br.com.rafabueno.fundamentos.genericos;

/**
 * Demonstração do uso de wrappers em Java, que são classes que representam tipos primitivos.
 * Wrappers fornecem métodos e funcionalidades adicionais aos tipos primitivos.
 */
public class Wrappers {

    /**
     * Método principal para demonstrar o uso de wrappers.
     */
    public static void main(String[] args) {

        // Exemplos de wrappers para tipos primitivos

        Byte b = 100; // Wrapper para o tipo byte
        Short s = 1000; // Wrapper para o tipo short
        Integer i = Integer.parseInt("10000"); // Wrapper para o tipo int
        Long l = 100000L; // Wrapper para o tipo long
        Float f = 10.500f; // Wrapper para o tipo float
        Double d = 1000.60; // Wrapper para o tipo double

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 10);
        System.out.println(l / 4);
        System.out.println(f);
        System.out.println(d);

        // Wrappers booleanos e caracteres

        Boolean bo = Boolean.parseBoolean("true"); // Wrapper para o tipo boolean
        System.out.println(bo); // Imprime o valor do wrapper Boolean
        System.out.println(bo.toString().toUpperCase()); // Converte para string e para maiúsculas

        Character c = '#'; // Wrapper para o tipo char
        System.out.println(c + "..."); // Concatenação com string

    }

}

/*
 * Exemplo de uso, o long com l minúsculo é um tipo primitivo, já com L maiúsculo se torna um WRAPPER, válido para todos os demais.
 */
