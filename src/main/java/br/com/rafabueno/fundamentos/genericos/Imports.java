package br.com.rafabueno.fundamentos.genericos;

import java.util.ArrayList; // Importa a classe ArrayList do pacote java.util

public class Imports {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(); // Cria uma nova instância da classe ArrayList que armazenará strings
        lista.add("Exemplo 1"); // Adiciona a string "Exemplo 1" à lista
        lista.add("Exemplo 2");

        for (String item : lista) { // Loop que percorre cada elemento da lista
            System.out.println(item); // Imprime cada elemento da lista
        }
    }
}

/*
 * Neste exemplo, import java.util.ArrayList; é usado para importar a classe ArrayList do pacote java.util.
 * Com isso, você pode usar ArrayList diretamente em seu código sem precisar usar o nome completo da classe, como no import.
 *
 */