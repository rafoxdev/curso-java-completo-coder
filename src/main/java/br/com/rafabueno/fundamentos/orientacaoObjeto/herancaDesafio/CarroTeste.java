package br.com.rafabueno.fundamentos.orientacaoObjeto.herancaDesafio;

public class CarroTeste {
    public static void main(String[] args) {

        Civic civic = new Civic();
        civic.acelerar();

        System.out.println(civic.velocidadeAtual);
        civic.acelerar();
        System.out.println(civic.velocidadeAtual);
        civic.acelerar();
        System.out.println(civic.velocidadeAtual);

        civic.frear();

        Ferrari ferrari = new Ferrari(400); // Velocidade máxima customizada
        ferrari.acelerar();

        System.out.println(ferrari.velocidadeAtual);
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeAtual);

        ferrari.frear();
    }
}
