package br.com.rafabueno.fundamentos.estruturasDeControle;

 /*
    Uma vez que o SWITCH não tenha o BREAK ao executar um case, ele irá também executar todos os outros abaixo.
 */

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-Dai");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
            default: // O default é usado no momento em que nenhum dos CASES é chamado, mas nesse caso especifico além de chamar os cases abaixo da faixa preta, chama o default também.
                System.out.println("Não sei nada");
        }
        System.out.println("FIM");

        int idade = 3;
        switch (idade) {
            case 5:
                System.out.println("Sabe falar");
            case 4:
                System.out.println("Sabe caminhar");
            case 3:
                System.out.println("Sabe engatinhar");
            case 2:
                System.out.println("Sabe chorar");
            case 1:
                System.out.println("Sabe mamar");
        }
    }
}
