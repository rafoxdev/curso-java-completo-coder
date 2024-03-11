package br.com.rafabueno.fundamentos.operadores;

public class Atribuicao {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        int c = a + b;

        c += b; // Equivalente -----> c = c + b
        c -= a; // Equivalente -----> c = c - b
        c *= b; // Equivalente -----> c = c * b
        c /= a; // Equivalente -----> c = c / b
        c %= 2; // Equivalente -----> c = c % 2; (Retorna 0 ou 1) 0 PAR 1 ÍMPAR

        System.out.println(c);

    }
}
