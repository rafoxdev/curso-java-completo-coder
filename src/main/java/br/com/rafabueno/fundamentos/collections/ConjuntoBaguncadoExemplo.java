package br.com.rafabueno.fundamentos.collections;

import java.util.HashSet;

public class ConjuntoBaguncadoExemplo {

    public static void main(String[] args) {

        HashSet conjunto = new HashSet();
        conjunto.add(1.2); // double -> Double (Conversões automáticas)
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("Teste");
        System.out.println("Tamanho é " + conjunto.size());

        // Caso adicionemos mais campos (.add) que tenham o mesmo valor, o tamanho continuará igual pois ele não aceita repetições.

        System.out.println(conjunto.remove("teste")); // false pois não existe teste com t minusculo dentro do conjunto
        System.out.println(conjunto.remove("Teste")); // true pois existe Teste...
        System.out.println(conjunto.remove('x')); // true pois existe x...

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains('x')); // false pois x foi removido
        System.out.println(conjunto.contains(1)); // true pois 1 existe
        System.out.println(conjunto.contains(true)); // true pois true existe

        HashSet nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums); // Interseção entre dois conjuntos
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
