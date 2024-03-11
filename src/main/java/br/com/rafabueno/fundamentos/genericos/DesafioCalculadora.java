package br.com.rafabueno.fundamentos.genericos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Informe o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Informe a operação: ");
        String op = entrada.next();

        // Lógica para calcular
        double resultado = ("+".equals(op)) ? (num1 + num2) :
                           ("-".equals(op)) ? (num1 - num2) :
                           ("*".equals(op)) ? (num1 * num2) :
                           ("/".equals(op)) ? (num1 / num2) :
                           ("%".equals(op)) ? (num1 % num2) : 0;
        // Se op não corresponder a nenhum dos casos, resultado será definido como 0.

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

        entrada.close();
    }
}
