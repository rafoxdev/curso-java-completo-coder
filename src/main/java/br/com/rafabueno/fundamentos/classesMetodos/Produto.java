package br.com.rafabueno.fundamentos.classesMetodos;

// Definição da classe Produto
public class Produto {

    // Declaração de forma EXPLICITA do CONSTRUTOR PADRÃO
    Produto() {
    }

    // Atributos da classe
    String nome;
    double preco;
    static double desconto = 0.25; // Definindo o atributo como static, torna-o pertencente a classe Produto, e não mais as instâncias criadas a partir do Produto.

    // Declaração do CONSTRUTOR PADRÃO mas com parâmetros e o retorno dos atributos, o que o torna diferente do DEFAULT.
    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }

}

/*
 - Se não houver a declaração do construtor explicitamente, então o Java fornecerá um construtor padrão automaticamente (não visível).
 - Quando cria-se um construtor novo perde-se o construtor DEFAULT, mas não impede de tornar EXPLICITO o construtor DEFAULT como foi feito nessa classe de exemplo.
 - Se não fosse declarado de forma EXPLICÍTA o contrutor default, o Java usaria o novo criado com a adiação dos parâmetros.
 - Na criação explicíta do construtor, ao usar o void na frente ele torna-se um método sem retorno e não mais um construtor.
 - Para fazermos as inicializações de objetos, usamos o contrutor, seja ele explicito ou não.
 - Ao definir um atributo como STATIC já não sentido passar ele como parâmetro no construtor, passa a falsa sensação que ele possa ser alterado a partir da instância.
 */
