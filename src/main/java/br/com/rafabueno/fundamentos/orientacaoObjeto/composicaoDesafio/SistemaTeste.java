package br.com.rafabueno.fundamentos.orientacaoObjeto.composicaoDesafio;

public class SistemaTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 1, 100);
        compra1.adicionarItem(new Produto("Notebook", 2000.00), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caderno", 10, 10);
        compra2.adicionarItem(new Produto("Impressora", 900.00), 1);

        Cliente cliente = new Cliente("Rafael Bueno");
        cliente.compraList.add(compra1);
        cliente.compraList.add(compra2);

        System.out.println(cliente.obterValorTotal());

    }
}
