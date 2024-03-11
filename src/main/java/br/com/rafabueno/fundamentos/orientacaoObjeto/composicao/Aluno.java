package br.com.rafabueno.fundamentos.orientacaoObjeto.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    final String nome;

    final List<Curso> cursos = new ArrayList<>(); // Definindo a lista com o "final" torna ela é uma contanste e não permite criar uma nova lista a partir dela.

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPorNome(String nome) {
        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }

    public String toString() {
        return nome;
    }
}
