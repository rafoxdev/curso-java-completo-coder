package br.com.rafabueno.fundamentos.classesMetodos.DesafioFinalModulo;

public class Jantar {
    public static void main(String[] args) {

        Comida comida1 = new Comida("Arroz", 0.250);
        Comida comida2 = new Comida("Feijão", 0.150);

        Pessoa pessoa1 = new Pessoa("Rafael", 89.0);

        System.out.println(pessoa1.apresentacao()); // Chamada do objeto pessoa1 a partir da instância feita sobre Pessoa, e do método apresentacao que retorna uma mensagem.
        pessoa1.comer(comida1); // Chamada do objeto pessoa1 e chamando o método de comer, o qual vai acrescentar o peso da comida, ao pessoa atual da pessoa.
        pessoa1.comer(comida2); // Nova chamada, acrescentando o método de comer mais uma vez a pessoa1.

        System.out.println(pessoa1.apresentacaoFinal()); // Após chamar o método de comer 2 vezes sobre o objeto pessoa1, irá retornar o pessoa atual + o peso das comidas instânciadas.

    }

}
