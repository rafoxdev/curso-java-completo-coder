package br.com.rafabueno.fundamentos.classesMetodos;

import java.util.Date;

public class Data {
    int dia;
    int mes;
    int ano;

    Data() { // Declarando que o construtor DEFAULT já possui um retorno EXPLICÍTO
//      dia = 9;
//      mes = 5;
//      ano = 1998;
        this(1,1,2025); // Usando this como método e passando valores que serão referentes aos ATRIBUTOS, porém usa-se dessa forma somente em um método CONSTRUTOR.
    }

    /**
     * Quando criamos um objeto da classe Data e chamamos esse construtor, os valores passados como parâmetros (diaInicial, mesInicial e anoInicial)...
     * ...são atribuídos aos atributos correspondentes da instância da classe usando o this, garantindo que o construtor inicialize corretamente os valores do objeto.
     */
    Data(int diaInicial, int mesInicial, int anoInicial) {
        this.dia = diaInicial;
        this.mes = mesInicial;
        this.ano = anoInicial;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d", dia,mes,ano);
    }

    // Essa maneira de retorno não é recomendada a utilização, e sim um método que retorne algo como foi no obterDataFormatada.
    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}

/**
 * - Sempre que precisar acessar um atributo que pertence a uma INSTÂNCIA podemos utilizar o this.nomeDoAtributo.
 * - O static é associado a classe, já o this é como se fosse uma instância da classe.
 * - Em instâncias do tipo static, não é possível a utilização do this para referenciar-se ao objeto.
 * - O this pode ser usado como objeto seguido do atributo: this.nome e como método this("Rafael")
 */