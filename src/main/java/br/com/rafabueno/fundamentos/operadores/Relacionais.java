package br.com.rafabueno.fundamentos.operadores;

public class Relacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b); // COMPARAÇÃO (A É IGUAL A B?)

        System.out.println(5 > 10); // MAIOR QUE
        System.out.println(5 < 10); // MENOR QUE
        System.out.println(5 >= 10); // MAIOR OU IGUAL
        System.out.println(5 <= 10); // MENOR OU IGUAL
        System.out.println(5 != 10); // DIFERENTE DE

        double nota = 8;
        boolean bomComportamento = false;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);


    }
}
