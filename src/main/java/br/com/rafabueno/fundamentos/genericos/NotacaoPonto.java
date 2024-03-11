package br.com.rafabueno.fundamentos.genericos;

// Classe NotacaoPonto
public class NotacaoPonto {

    // Classe interna Pessoa
    public static class Pessoa {
        String nome;
        int idade;

        public void cumprimentar() {
            System.out.println("Olá, eu sou " + nome);
        }
    }

    // Classe interna ExemploNotacaoPonto
    public static class ExemploNotacaoPonto {
        public static void main(String[] args) {
            Pessoa pessoa1 = new Pessoa();
            pessoa1.nome = "Maria"; // Atribuição do valor "Maria" para o atributo 'nome'
            pessoa1.idade = 30; // Atribuição do valor 30 para o atributo 'idade'

            pessoa1.cumprimentar(); // Chamada do método 'cumprimentar()' da classe Pessoa para o objeto 'pessoa1'
        }
    }
}

/*
 *
 * NotacaoPonto: É a classe principal que contém duas classes internas estáticas (Pessoa e ExemploNotacaoPonto).
 *
 * Pessoa: É uma classe interna estática de NotacaoPonto. Possui dois campos (nome e idade) e um método cumprimentar() que imprime uma saudação usando o valor do campo nome.
 *
 * ExemploNotacaoPonto: Também é uma classe interna estática de NotacaoPonto.
 * Que possui um método main() que cria uma instância da classe Pessoa e a utiliza para definir valores para os campos nome e idade e chamar o método cumprimentar().
 *
 * No exemplo de código criado acima a notação ponto faz o seguinte:
 * (pessoa1.nome e pessoa1.idade) é usada para acessar os campos (nome e idade) do objeto pessoa1 (instância da classe Pessoa) e atribuir valores a eles.
 *
 */