package br.com.rafabueno.fundamentos.estruturasDeControle;

import java.util.Scanner;

public class WhileDeterminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valor = "";
        while(!valor.equalsIgnoreCase("Sair")) {
            System.out.println("Você diz: ");
            valor = entrada.nextLine();
        }
    }
}
