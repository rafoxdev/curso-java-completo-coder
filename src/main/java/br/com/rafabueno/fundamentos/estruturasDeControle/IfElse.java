package br.com.rafabueno.fundamentos.estruturasDeControle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número:");

        int numero = Integer.parseInt(valor);
        if (numero % 2 == 0) {
            System.out.println("Número par");
        } else
            System.out.println("Número ímpar");
    }
}

/*
    O bloco de código dentro do if é executado se a condição booleana associada a ele for verdadeira.
    O bloco dentro do else é executado se a condição do if for falsa.
 */
