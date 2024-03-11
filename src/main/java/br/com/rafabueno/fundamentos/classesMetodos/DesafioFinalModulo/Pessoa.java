package br.com.rafabueno.fundamentos.classesMetodos.DesafioFinalModulo;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nomePessoa, double pesoPessoa) {
        this.nome = nomePessoa;
        this.peso = pesoPessoa;
    }

    void comer(Comida comidinha) {
        if(comidinha != null) {
            this.peso += comidinha.peso;
        }
    }

    String apresentacao() {
        return "Olá me chamo " + nome + " e atualmente peso " + peso + "KG";
    }

    String apresentacaoFinal() {
        return "Após toda essa comilança eu passei a pesar " + peso + "KG";
    }



}
