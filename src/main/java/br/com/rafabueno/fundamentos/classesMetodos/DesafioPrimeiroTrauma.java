package br.com.rafabueno.fundamentos.classesMetodos;

/**
 * - O desafio consiste em conseguir usar variável idadeSonia estando fora do escopo do método Main.
 * - Para corrigir isso, não deve-se mexer no conteúdo da variável, e sim somente no método.
 */

public class DesafioPrimeiroTrauma {
    int idadeSonia = 45; // Esse atributo pertence a instância

    public static void main(String[] args) {

        DesafioPrimeiroTrauma acessoAoAtributo = new DesafioPrimeiroTrauma();

        System.out.println(acessoAoAtributo.idadeSonia);
    }
}

/**
 * - Não é possível acessar um valor de uma INSTÂNCIA diretamente a partir de um membro ESTÁTICO.
 * - Foi criada uma instância da classe e com base nela, foi possível acessar a variável pertencente a instância (classe).
 */