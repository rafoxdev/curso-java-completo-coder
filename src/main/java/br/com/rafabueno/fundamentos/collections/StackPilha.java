package br.com.rafabueno.fundamentos.collections;

import java.util.Deque;

public class StackPilha {
    public static void main(String[] args) {

        Deque <String> livros = new java.util.LinkedList<>();
        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote"); // Adiciona um elemento no topo da pilha
        livros.push("O Hobbit");

        System.out.println(livros.peek()); // Retorna "O Hobbit" elemento que está no topo da pilha, o último a entrar é o primeiro a sair.
        System.out.println(livros.element());

        for(String livro: livros) {
            System.out.println(livro);
        }

        System.out.println(livros.pop()); // O pop também remove elementos da pilha assim como o poll.
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll()); // Retorna null pois não existe mais elementos na pilha.

        livros.size();
        livros.clear();
        livros.isEmpty();
        livros.contains("O Pequeno Príncipe");

    }
}
