package br.com.rafabueno.fundamentos.genericos;

public class AreaCircunferencia {
    public static void main(String[] args) { // Método principal

        double raio = 4.4; // Declaração e inicialização da variável "raio" com o valor 4.4
        final double PI = 3.14159; // Declaração da constante "PI" com o valor 3.14159

        double area = PI * raio * raio; // Cálculo da área utilizando a fórmula PI * raio * raio
        System.out.println(area); // Exibe a área calculada

        raio = 10; // Atualização do valor da variável "raio" para 10
        area = PI * raio * raio; // Recálculo da área com o novo valor do raio
        System.out.println("Área = " + area + "m2."); // Exibe a nova área calculada com uma mensagem concatenada
    }

}
