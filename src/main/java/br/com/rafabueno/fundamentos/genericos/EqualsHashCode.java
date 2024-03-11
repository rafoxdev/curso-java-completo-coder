package br.com.rafabueno.fundamentos.genericos;

public class EqualsHashCode {
    public static void main(String[] args) {
        Usuario user1 = new Usuario();
        user1.nome = "Rafael";
        user1.sobrenome = "Bueno";
        user1.email = "orafaelbueno@gmail.com";

        Usuario user2 = new Usuario();
        user2.nome = "Rafael";
        user2.sobrenome = "Bueno";
        user2.email = "orafaelbueno@gmail.com";

        // Exemplos de comparação usando equals e objetos como referência para comparação. O que é comparado é o local em memória, que sempre serão diferentes quando trata-se de objetos.
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user1));

        System.out.println();
    }
}
