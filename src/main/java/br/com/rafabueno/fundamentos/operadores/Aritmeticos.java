package br.com.rafabueno.fundamentos.operadores;

public class Aritmeticos {

    public static void main(String[] args) {
        System.out.println(5 + 10); // Adição

        var x = 25.50;
        double y = 2.5;

        // Operações aritméticas com números double
        System.out.println(x + y); // Soma
        System.out.println(x - y); // Subtração
        System.out.println(x * y); // Multiplicação
        System.out.println(x / y); // Divisão

        int a = 10;
        int b = 5;

        // Operações aritméticas com números int
        System.out.println(a + b); // Soma
        System.out.println(a - b); // Subtração
        System.out.println(a * b); // Multiplicação
        System.out.println(a / b); // Divisão (resultado inteiro)

        // Conversão para double ou float usando casting
        System.out.println(a + (double) b); // Conversão de b para double antes da soma
        System.out.println(a * (float) b); // Conversão de b para float antes da multiplicação

        // Resto da divisão (Módulo)
        System.out.println(a % b); // Resto da divisão de a por b
        System.out.println(8 % 3); // Resto da divisão de 8 por 3
    }
}
