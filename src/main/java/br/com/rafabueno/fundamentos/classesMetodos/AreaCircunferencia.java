package br.com.rafabueno.fundamentos.classesMetodos;

public class AreaCircunferencia {
    double raio;
    static double PI = 3.14;

    AreaCircunferencia(double raioInicial) {
        raio = raioInicial;
    }
    double area() {
        return PI * raio * raio;
    }
}
