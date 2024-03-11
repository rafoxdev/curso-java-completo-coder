package br.com.rafabueno.fundamentos.operadores;

public class Unarios {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // Forma pós-fixada (Operador depois)
        a++; // EQUIVALENTE -> a = a + 1 (Menos pressa para fazer a operação)
        b--; // EQUIVALENTE -> a = a - 1

        // Forma pré-fixada (Operador antes)
        ++b; // EQUIVALENTE -> b = b + 1 (Mais pressa para fazer a operação)
        --b; // EQUIVALENTE -> b = b - 1

        System.out.println(a);
        System.out.println(b);

        System.out.println("Verifique o retorno da seguinte comparação: " + (++a == b--)); // ++ tem precedência sobre o operador de comparação == então ele vai incrementar para depois comparar
    }
}
