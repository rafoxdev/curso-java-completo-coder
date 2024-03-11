package br.com.rafabueno.fundamentos.operadores;

public class Logicos {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 5 > 10; // Esta condição será falsa


        System.out.println(condicao1 && !condicao2); // true && !false = true
        System.out.println(condicao1 || condicao2); // true || false = true
        System.out.println(condicao1 ^ condicao2); // true ^ false = true
        System.out.println(!!condicao1); // !!true = true
        System.out.println(!condicao2); // !false = true

        // Tabelas verdade para os operadores lógicos

        // Tabela da verdade para &&
        System.out.println("\nTabela da verdade && (E - AND)");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // Tabela da verdade para ||
        System.out.println("\nTabela da verdade || (OU - OR)");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // Tabela da verdade para ^
        System.out.println("\nTabela da verdade ^ (OU Exclusivo - XOR)");
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false

        // Tabela da verdade para !
        System.out.println("\nTabela da verdade ! (NÃO - NOT)");
        System.out.println(!true); // false
        System.out.println(!false); // true
    }

}