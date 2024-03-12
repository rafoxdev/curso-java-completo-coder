package br.com.rafabueno.fundamentos.orientacaoObjeto.heranca;

public class Heroi extends Jogador { // Extende de jogador

    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente); // O uso do super é para chamar o metodo da classe pai
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }
}
