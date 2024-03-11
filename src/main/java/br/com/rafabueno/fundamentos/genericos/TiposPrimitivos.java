package br.com.rafabueno.fundamentos.genericos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        byte numeroPequeno = 125;
        short numeroCurto = 30000;
        int idade = 150;
        long valorLongo = 5000000000L; // O sufixo 'L' indica que é um valor longo
        float altura = 1.75f; // O sufixo 'f' indica que é um valor float
        double salario = 2500.50;
        char letra = 'A';
        boolean ativo = true;
    }
}

/*
 *  Tamanho e uso dos tipos primitivos:
 *
 *  byte: 8 bits (1 byte)
    Faixa de valores: -128 a 127

    short: 16 bits (2 bytes)
    Faixa de valores: -32,768 a 32,767

    int: 32 bits (4 bytes)
    Faixa de valores: -2,147,483,648 a 2,147,483,647

    long: 64 bits (8 bytes)
    Faixa de valores: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

    float: 32 bits (4 bytes)
    Faixa de valores: ±3.40282347 x 10^38 com até 7 dígitos decimais de precisão

    double: 64 bits (8 bytes)
    Faixa de valores: ±1.7976931348623157 x 10^308 com até 15 dígitos decimais de precisão

    char: 16 bits (2 bytes)
    Armazena um único caractere Unicode (16 bits)

    boolean: Tamanho não especificado de forma precisa. Mas geralmente em sua maioria acaba ocupando um byte.

 */