package br.com.rafabueno.fundamentos.orientacaoObjeto.heranca;

public class Jogo {
    public static void main(String[] args) {

        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(); // Instanciando a classe Heroi que extende de Jogador
        heroi.x = 10;
        heroi.y = 11;

        System.out.println("Monstro tem => " + monstro.x);
        System.out.println("Heroi tem => " + heroi.y);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.mudarDePosicao(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);


        System.out.println("Monstro tem => " + monstro.x);
        System.out.println("Heroi tem => " + heroi.y);

    }
}
