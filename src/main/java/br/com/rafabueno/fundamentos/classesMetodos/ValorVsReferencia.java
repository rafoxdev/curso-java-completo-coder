package br.com.rafabueno.fundamentos.classesMetodos;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double idadeRafa = 25;
        double idadeCarol = idadeRafa; // Atribuição por valor (Tipo primitivo)

        idadeRafa++;
        idadeCarol--;

        System.out.println(idadeRafa + " " + idadeCarol);

        Data data1 = new Data(10,05,2025);
        Data data2 = data1; // Atribuição por referência (Objeto)

        // Como data1 e data2 apontam para o mesmo OBJETO em MEMÓRIA a alteração de um reflete na do outro, pois estão ocupando o mesmo espaço alocado.
        data1.dia = 25;
        data2.mes = 8;
        data1.ano = 1995;

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());
    }
}

/**
 * Atribuição por Valor (Tipos Primitivos):
 *
 * Quando atribuímos um valor a uma variável de um tipo primitivo (como int, double, etc.), estamos lidando com atribuição por valor.
 * Atribuição por valor significa que a variável contém diretamente o valor atribuído.
 * Quando atribuímos o valor de uma variável para outra, uma cópia direta do valor é feita. Modificar uma variável não afeta a outra.
 */

/**
 * Atribuição por Referência (Objetos):
 *
 * Quando você trabalha com objetos, a atribuição é feita por referência.
 * Atribuição por referência significa que a variável não contém diretamente o objeto, mas sim uma referência (um endereço de memória) para o objeto.
 * Quando você atribui um objeto a outra variável, ambas as variáveis referem-se ao mesmo objeto, como foi feito no exemplo acima.
 * Modificar o objeto através de uma variável afeta todas as outras variáveis que referem-se ao mesmo objeto.
 */
