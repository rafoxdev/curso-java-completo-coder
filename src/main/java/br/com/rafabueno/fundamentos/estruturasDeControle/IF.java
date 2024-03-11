package br.com.rafabueno.fundamentos.estruturasDeControle;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = entrada.nextDouble();

        if(media <= 10 && media >= 7.0) { // Verifica se a média está no intervalo de aprovação (entre 7.0 e 10.0)
            System.out.println("Você foi aprovado. Parabéns!");
        }
        if (media < 7 && media >= 4.5) { // Verifica se a média está no intervalo de recuperação (entre 4.5 e 7.0, excluindo 7.0)
            System.out.println("Você ficou em recuperação!");
        }
        if (media < 4.5 && media >=0) { // Verifica se a média está no intervalo de reprovação (entre 0.0 e 4.5, excluindo 4.5)
            System.out.println("Você está reprovado!");
        }

        entrada.close();
    }
}
