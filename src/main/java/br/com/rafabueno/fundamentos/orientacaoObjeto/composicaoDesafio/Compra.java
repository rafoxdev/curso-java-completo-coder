package br.com.rafabueno.fundamentos.orientacaoObjeto.composicaoDesafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto prod, int quant) {
        this.itens.add(new Item(prod, quant));
    }

    void adicionarItem(String nome, double preco, int quant) {
        var produto = new Produto(nome, preco);
        this.itens.add(new Item(produto, quant));
    }

    double obterValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
