package br.com.rafabueno.fundamentos.orientacaoObjeto.composicao;

/**
 * RELACIONAMENTO 1 PARA 1:
 *
 * Neste exemplo, a classe Carro tem um motor. O motor é uma parte do carro, ou seja, o motor não existe sem o carro.
 */

public class Motor {
    boolean ligado = false;
    double fatorInjecao = 1;

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
