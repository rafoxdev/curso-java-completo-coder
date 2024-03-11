package br.com.rafabueno.fundamentos.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportadoExemplo {
    public static void main(String[] args) {

        //Set<String> listaAprovados = new HashSet<>(); // Aqui definimos que o conjunto é do tipo String e é uma lista
        SortedSet<String> listaAprovados = new TreeSet<>(); // Ele ordena os elementos de forma crescente conforme a ordem de inserção, a diferença pro HashSet é que ele ordena os elementos.
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>(); // Aqui definimos que o conjunto é do tipo Integer e é uma lista
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for (int n : nums) {
            System.out.println(n);
        }

        // Dentro do <> é onde define a tipagem de dados que o conjunto irá receber.

    }
}
