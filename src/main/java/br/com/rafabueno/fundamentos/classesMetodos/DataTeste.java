package br.com.rafabueno.fundamentos.classesMetodos;

public class DataTeste {
    public static void main(String[] args) {

        // INSTÂNCIANDO o construtor DEFAULT que já possui o retorno no momento que ele foi definido explicitamente na CLASSE
        Data meuAniversario = new Data();

        // INSTÂNCIANDO o construtor que possui os parâmetros e atributos de retorno definidos na sua construção.
        Data aniversarioCarol = new Data(13, 02, 1997);

        String dataFormatada = meuAniversario.obterDataFormatada(); // Armanzenando o return na variável dataFormatada
        System.out.println(dataFormatada);

        System.out.println(meuAniversario.obterDataFormatada()); // Chamando diretamente o método através do objeto meuAniversario
        System.out.println(aniversarioCarol.obterDataFormatada());

    }
}


