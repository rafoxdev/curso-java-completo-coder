package br.com.rafabueno.fundamentos.orientacaoObjeto.herancaDesafio;

public class Ferrari extends Carro {

        Ferrari() {
            super(350); // Padrão da velocidade máxima
        }

        Ferrari (int velocidadeMaxima) {
            super(velocidadeMaxima); // Velocidade máxima customizada
            delta = 15; // Aumento do delta para 15
        }

        @Override // O uso do @Override é opcional, mas é uma boa prática para garantir que o método está sendo sobrescrito.
        void acelerar() {
            velocidadeAtual += 15; // Esse método poderia ser comentado pois no construtor da Ferrari já foi definido o delta como 15.
        }

        @Override
        void frear() {
            if (velocidadeAtual >= 15) {
                velocidadeAtual -= 15;
            } else {
                velocidadeAtual = 0;
            }
        }

        public String toString() {
            return "Velocidade atual é " + velocidadeAtual + "Km/h.";
        }
}
