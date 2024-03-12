package br.com.rafabueno.fundamentos.orientacaoObjeto.heranca;

public class Jogador {
    int x; // Declarando dois atributos com valor 0
    int y;
    int vida = 100;

    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(x - oponente.x);

        if(deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        } else {
            return false;
        }

    }

    boolean mudarDePosicao(Direcao direcao) { // Passando como parametro o ENUM que possui os dados da direcao
        switch (direcao) {
            case NORTE: // Chamada dos atributos do ENUM
                y--;
                break;
            case SUL:
                x++;
                break;
            case  LESTE:
                y++;
            case OESTE:
                x--;
        }
        return true;
    }
}
