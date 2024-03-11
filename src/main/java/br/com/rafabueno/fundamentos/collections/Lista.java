package br.com.rafabueno.fundamentos.collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Luca"));
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3)); // Pedro

        System.out.println(">>>>" + lista.remove(1)); // Carlos
        System.out.println(lista.remove(new Usuario("Manu"))); // true

        System.out.println("Tem? " + lista.contains(new Usuario("Lia"))); // true

        for(Usuario u : lista) {
            System.out.println(u.nome);
        }
    }
}
