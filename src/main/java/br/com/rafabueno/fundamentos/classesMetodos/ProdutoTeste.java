package br.com.rafabueno.fundamentos.classesMetodos;

public class ProdutoTeste { // Classe de teste para a classe Produto


    public static void main(String[] args) {  // Método principal

        // Chamada do construtor que possui os parâmetros e atributos definidos já lá no construtor, e dentro do conteúdo da instãncia os valores pertencentes a esses atributos.
        Produto p1 = new Produto("iPhone", 6000.00);

        Produto p2 = new Produto();  // Criando uma instância (objeto) da classe Produto - p2
        p2.nome = "Caneta"; // Definindo o conteúdo dos atributos do objeto p2
        p2.preco = 10.00;
        Produto.desconto = 0.50; // Como definimos o desconto como static, ele passou a ser um atributo da classe e não mais da instância, por isso chama-se a classe seguida do atributo.

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.10);
        double mediaPreco = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("A média de preço dos produtos é: R$%.2f.", mediaPreco);

    }
}

/*
 -
 -
 */