package br.com.rafabueno.fundamentos.estruturasDeControle;

import java.util.Scanner;

/*
    O uso do switch com BREAK ao entrar em um case, o break faz com que se encerre a iteração sobre o bloco.
 */

public class SwitchComBreak {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String conceito = "";

        System.out.println("Informe uma nota: ");
        int nota = entrada.nextInt();

        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
                conceito = "E";
                break;
            default:
                System.out.println("Não ENCONTRADO! ");

        }
        System.out.println("O conceito é: " + conceito);
        entrada.close();
    }
}
