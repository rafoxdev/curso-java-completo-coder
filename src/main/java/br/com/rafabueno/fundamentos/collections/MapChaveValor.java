package br.com.rafabueno.fundamentos.collections;

import java.util.HashMap;
import java.util.Map;

public class MapChaveValor {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto"); // .put() é o método que adiciona elementos no Map
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size()); // 4 que é a quantidade de elementos no Map
        System.out.println(usuarios.isEmpty()); // false pois o Map não está vazio
        System.out.println(usuarios.keySet()); // Retorna as chaves do Map
        System.out.println(usuarios.values()); // Retorna os valores do Map
        System.out.println(usuarios.entrySet()); // Retorna a chave e o valor do Map
        System.out.println(usuarios.containsKey(2)); // true pois a chave 2 existe no Map
        System.out.println(usuarios.containsValue("Rebeca")); // true pois o valor Rebeca existe no Map
        System.out.println(usuarios.get(3)); // Retorna Rafaela equivalente a chave 3 presente no Map

        for(int chave : usuarios.keySet()) { // Percorrendo as chaves do Map, retorna as chaves.
            System.out.println(chave);
        }

        for(String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro : usuarios.entrySet()) { // Percorrendo as chaves e valores do Map, retorna as chaves e valores.
            System.out.print(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }
    }
}
