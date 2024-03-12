package br.com.rafabueno.fundamentos.orientacaoObjeto.composicao;

import br.com.rafabueno.fundamentos.orientacaoObjeto.composicao.Carro;

/**
 * RELACIONAMENTO 1 PARA 1:
 *
 * Neste exemplo, a classe Carro tem um motor. O motor é uma parte do carro, ou seja, o motor não existe sem o carro.
 */

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        System.out.println(carro1.estaLigado());

        carro1.ligar();
        System.out.println(carro1.estaLigado());

        System.out.println(carro1.motor.giros());

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        System.out.println(carro1.motor.giros());

        carro1.frear();
        carro1.frear();

        System.out.println(carro1.motor.giros());

        carro1.desligar();
        System.out.println(carro1.estaLigado());
    }
}
