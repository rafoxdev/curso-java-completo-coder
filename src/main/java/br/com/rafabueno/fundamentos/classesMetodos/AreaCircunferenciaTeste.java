package br.com.rafabueno.fundamentos.classesMetodos;

public class AreaCircunferenciaTeste {
    public static void main(String[] args) {
        AreaCircunferencia area1 = new AreaCircunferencia(5.5);
//      area1.pi = 10;
        System.out.println(area1.area());

//      AreaCircunferencia.pi = 3.1415; // Como PI foi definido como static, podemos acessar ele dessa maneira, podendo em seguida alterar o seu valor.
//
        AreaCircunferencia area2 = new AreaCircunferencia(15.10);
//      area2.pi = 5;
        System.out.println(area2.area());
    }
}
/**
 * Caso definamos pi como sendo uma constante PI (Letras maiúsculas) como sabemos, constantes são valores imutáveis.
 */