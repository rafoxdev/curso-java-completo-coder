package br.com.rafabueno.fundamentos.orientacaoObjeto.composicao;

/**
 * RELACIONAMENTO 1 PRA MUITOS:
 *
 * Nesse quesito de relacionamento, no exemplo utilizado a classe compra tem varios itens, ou seja, um para muitos.
 * Já os itens podem tem uma única compra, ou seja, um para um.
 */

public class CompraTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Rafael Bueno";
        compra1.adicionarItem("Caneta", 20, 7.45);
        compra1.adicionarItem("Borracha", 12, 3.89);
        compra1.adicionarItem("Caderno", 3, 18.79);

        System.out.println(compra1.itens.size());
        System.out.println(compra1.getValorTotal());

        // Só para exemplificar o relacionamento bidirecional
        double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
        System.out.println("O total é R$ " + total);
    }
}
