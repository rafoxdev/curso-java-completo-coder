package br.com.rafabueno.fundamentos.orientacaoObjeto.composicao;

import java.util.ArrayList;

/**
 * RELACIONAMENTO 1 PRA MUITOS:
 *
 * Nesse quesito de relacionamento, no exemplo utilizado a classe compra tem varios itens, ou seja, um para muitos.
 * Já os itens podem tem uma única compra, ou seja, um para um.
 */

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    void adicionarItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }

    double getValorTotal () {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}

