package br.com.rafabueno.fundamentos.genericos;

public class Usuario {

    String nome;
    String sobrenome;
    String email;

    @Override
    public boolean equals(Object objeto) { // Equals implementado para verificar se um usuário é igual a outro usuário.
        Usuario novoUsuario = (Usuario) objeto;

        boolean nomeIgual = novoUsuario.nome.equals(this.nome);
        boolean sobrenomeIgual = novoUsuario.nome.equals(this.sobrenome);
        boolean emailIgual = novoUsuario.nome.equals(this.email);

        return nomeIgual && sobrenomeIgual && emailIgual;
    }
}
