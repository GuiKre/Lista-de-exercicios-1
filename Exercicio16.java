public class Exercicio16 {

    public static void executar(){

        Double nota1 = Prompt.lerDecimal("Digite a nota 1: ");
        Double nota2 = Prompt.lerDecimal("Digite a nota 2: ");
        Double nota3 = Prompt.lerDecimal("Digite a nota 3: ");

        Double media = (nota1 + nota2 + nota3) / 3;

        Prompt.imprimir("Média: " + media);
    }   
}
