public class Exercicio18 {

    public static void executar(){

        Double nota1 = Prompt.lerDecimal("Digite a nota 1: ");
        Double nota2 = Prompt.lerDecimal("Digite a nota 2: ");
        Double nota3 = Prompt.lerDecimal("Digite a nota 3: ");

        Double mediaharm = 3 / ((1/nota1) + (1/nota2) + (1/nota3));

        Prompt.imprimir("Média harmônica: " + mediaharm);
    }
}
