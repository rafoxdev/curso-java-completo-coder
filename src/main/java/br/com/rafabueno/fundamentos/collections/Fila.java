package br.com.rafabueno.fundamentos.collections;

import com.sun.tools.javac.Main;

import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new java.util.LinkedList<>();

        // Offer e Add -> adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> obter o próximo elemento da fila (sem remover)
        // Diferença é o comportamento quando a fila está vazia!
        System.out.println(fila.peek()); // retorna null se a fila estiver vazia
        System.out.println(fila.element()); // lança uma exceção se a fila estiver vazia

        fila.size();
        fila.clear();
        fila.isEmpty();

        System.out.println(fila.poll()); // retorna null se a fila estiver vazia
        System.out.println(fila.remove()); // lança uma exceção se a fila estiver vazia
        System.out.println(fila.poll()); // Repetindo até existir os contéudos de nomes, após o ultimo elemento, retorna null caso não exista mais conteúdo.
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        // fila.size();
        // fila.clear();
        // fila.isEmpty();
        // fila.contains();

    }
}
