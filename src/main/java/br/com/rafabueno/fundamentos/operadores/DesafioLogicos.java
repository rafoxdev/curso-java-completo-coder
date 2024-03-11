package br.com.rafabueno.fundamentos.operadores;

/**
 * Esse desafio proposto é uma situação onde uma pessoa caso consiga fazer 2 trabalhos extras na semana, ela tera renda para comprar uma tv 50 ou 75.
 * Caso ela compre a tv de 50 eles em seguida tomam sorvete, se for a de 75 eles não tomam.
 */

public class DesafioLogicos {
    public static void main(String[] args) {

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTv50;
        boolean comprouTv75;

        String tomarSorvete = "vamos tomar sorvete";
        String semTomarSorvete = "não vamos tomar sorvete";

        if (!(trabalho1 && trabalho2)) {
            comprouTv75 = true;
            System.out.println("Familia nós " + semTomarSorvete);
        } else {
            comprouTv50 = true;
            System.out.println("Familia nós " + tomarSorvete);
        }
    }
}
