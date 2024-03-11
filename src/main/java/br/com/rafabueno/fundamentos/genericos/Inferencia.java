package br.com.rafabueno.fundamentos.genericos;

import java.util.ArrayList;

public class Inferencia {

    public static void main(String[] args) {
        var numero = 10; // Uso da inferência de tipo: o compilador infere que "numero" é do tipo int
        var texto = "Exemplo"; // Uso da inferência de tipo: o compilador infere que "texto" é do tipo String

        System.out.println("O tipo de 'numero' é: " + numero); // Exibe o tipo da variável 'numero'
        System.out.println("O tipo de 'texto' é: " + texto); // Exibe o tipo da variável 'texto'

        // Usando a inferência com tipos complexos
        var lista = new ArrayList<String>(); // O compilador infere que "lista" é do tipo ArrayList<String>
        lista.add("Elemento 1");
        lista.add("Elemento 2");

        System.out.println("Os elementos da lista são: " + lista);
    }
}

/*
 *
 * Neste código, utilizamos a palavra-chave var, introduzida no Java a partir da versão 10, para realizar a inferência de tipos.
 * Quando utilizamos var, o compilador Java infere automaticamente o tipo da variável com base no valor atribuído a ela.
 * Entretanto, é importante notar que o tipo é inferido em tempo de compilação e não é uma tipagem dinâmica.
 *
 * No exemplo, var numero = 10; e var texto = "Exemplo"; demonstram a inferência de tipos para variáveis simples.
 * O compilador infere automaticamente que numero é do tipo int e texto é do tipo String.
 *
 */
