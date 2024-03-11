package br.com.rafabueno.fundamentos.orientacaoObjeto.composicao;

/**
 * RELACIONAMENTO 1 PARA 1:
 *
 * Neste exemplo, a classe Carro tem um motor. O motor é uma parte do carro, ou seja, o motor não existe sem o carro.
 */

public class Carro {
    Motor motor = new Motor();

    void ligar() {
        motor.ligado = true;
    }

    void acelerar() {
        motor.fatorInjecao += 0.4;
    }

    void frear() {
        if(motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }

}
