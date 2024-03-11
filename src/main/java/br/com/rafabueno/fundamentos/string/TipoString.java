package br.com.rafabueno.fundamentos.string;

public class TipoString {

    public static void main(String[] args) {
        // Criando strings de diferentes maneiras
        String string1 = "Olá, mundo!"; // Criando uma string diretamente com aspas duplas
        String string2 = new String("Java é poderoso!"); // Criando uma string usando o construtor da classe String

        // Concatenando strings
        String concatenada = string1 + " " + string2; // Concatenação de duas strings usando o operador '+'

        // Obtendo informações sobre a string
        int comprimento = string1.length(); // Obtendo o comprimento da string usando o método length()
        char primeiroCaractere = string2.charAt(0); // Obtendo o primeiro caractere da string usando charAt()

        // Comparando strings
        boolean saoIguais = string1.equals(string2); // Verificando se duas strings são iguais usando o método equals()
        boolean saoIguaisIgnorandoCase = string1.equalsIgnoreCase("OlÁ, MUNDO!"); // Comparando strings ignorando case
        boolean terminaCom = string2.endsWith("poderoso!"); // Verificando se a string termina com determinado sufixo

        // Verificando o início e fim da string
        boolean comecaCom = string1.startsWith("Olá"); // Verificando se a string começa com determinado prefixo
        boolean contem = concatenada.contains("Java"); // Verificando se uma string contém outra usando contains()

        // Substrings
        String parte = concatenada.substring(5, 10); // Obtendo uma substring a partir da posição 5 até a posição 9 (exclusive)

        // Transformando string para maiúsculas e minúsculas
        String emMaiuscula = string1.toUpperCase(); // Transformando a string para letras maiúsculas usando toUpperCase()
        String emMinuscula = string2.toLowerCase(); // Transformando a string para letras minúsculas usando toLowerCase()

        // Imprimindo os resultados
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);
        System.out.println("Strings concatenadas: " + concatenada);
        System.out.println("Comprimento de string1: " + comprimento);
        System.out.println("Primeiro caractere de string2: " + primeiroCaractere);
        System.out.println("String1 é igual a string2? " + saoIguais);
        System.out.println("String1 é igual a 'OlÁ, MUNDO!' ignorando case? " + saoIguaisIgnorandoCase);
        System.out.println("A string2 termina com 'poderoso!'? " + terminaCom);
        System.out.println("String1 começa com 'Olá'? " + comecaCom);
        System.out.println("A string concatenada contém 'Java'? " + contem);
        System.out.println("Parte da string concatenada: " + parte);
        System.out.println("String1 em maiúsculas: " + emMaiuscula);
        System.out.println("String2 em minúsculas: " + emMinuscula);
    }
}
