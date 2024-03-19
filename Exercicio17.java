public class Exercicio17 {

    public static void executar(){

        Double nota1 = Prompt.lerDecimal("Digite a nota 1: ");
        Double nota2 = Prompt.lerDecimal("Digite a nota 2: ");
        Double nota3 = Prompt.lerDecimal("Digite a nota 3: ");
        Double peso1 = Prompt.lerDecimal("Digite o peso da nota 1: ");
        Double peso2 = Prompt.lerDecimal("Digite o peso da nota 2: ");
        Double peso3 = Prompt.lerDecimal("Digite o peso da nota 3: ");

        Double mediapond = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        Prompt.imprimir("Média ponderada: " + mediapond);
    }
}
