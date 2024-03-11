package br.com.rafabueno.fundamentos.genericos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        // Solicita ao usuário que digite o primeiro número
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");

        // Solicita ao usuário que digite o segundo número
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        // Concatenação de strings (não realiza a soma)
        // Imprime a concatenação das strings

        // Conversão de strings para números usando parseDouble()
        double numero1 = Double.parseDouble(valor1); // Converte a string para um número double
        double numero2 = Double.parseDouble(valor2); // Converte a string para um número double

        // Realiza a soma dos números convertidos
        double soma = numero1 + numero2;
        System.out.println("A soma é: " + soma); // Imprime o resultado da soma

        String meuNome = "10";
        double meuNomeConvertido = Integer.parseInt(meuNome);
        System.out.println(meuNome);
    }
}
/*
 * Esses métodos parseDouble() e parseInt() (para números inteiros) são usados para converter Strings em valores numéricos para realizar operações matemáticas em Java.
 */
