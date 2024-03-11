package br.com.rafabueno.fundamentos.genericos;

/**
 * Demonstração de conversão de tipos primitivos em Java.
 * Mostra diferentes formas de conversão implícita e explícita entre tipos primitivos.
 */
public class ConversaoTipoPrimitivos {

    /**
     * Método principal para demonstrar conversão de tipos primitivos.
     */
    public static void main(String[] args) {

        // Conversão implícita: int pode ser atribuído a double automaticamente
        double a = 1; // Forma implícita feita automaticamente pelo Java
        System.out.println(a);

        // Conversão explícita (cast): double para float
        float b = (float) 1.1050000;
        System.out.println(b);

        // Conversão de tipos com possíveis perdas de informação
        int c = 500;
        byte d = (byte) c; // Realiza um cast para byte
        System.out.println(d);

        // Conversão de tipos com truncamento decimal
        double e = 1.99;
        int f = (int) e; // Forma explícita (CAST) com truncamento decimal
        System.out.println(f);

        double camisa = (int) 10.0;
        System.out.println(camisa);
    }
}

/*
 * Esses exemplos mostram como a conversão de tipos primitivos pode ocorrer implicitamente (quando não há perda de dados).
 * Ou explicitamente (quando é necessário o uso do operador de cast - (tipo)).
 * É importante notar que ao fazer conversões explícitas, podem ocorrer perdas de precisão ou truncamento de dados, dependendo dos tipos envolvidos.
 */
