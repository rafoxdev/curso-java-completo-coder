package br.com.rafabueno.fundamentos.orientacaoObjeto.composicao;

/**
 * RELACIONAMENTO 1 PRA MUITOS:
 *
 * Nesse quesito de relacionamento, no exemplo utilizado a classe compra tem varios itens, ou seja, um para muitos.
 * Já os itens podem tem uma única compra, ou seja, um para um.
 */

public class Item {

    String nome;
    int quantidade;
    double preco;
    Compra compra;

    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
