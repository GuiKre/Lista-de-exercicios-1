public class Exercicio05 {
    
    public static void executar(){

        Double a = Prompt.lerDecimal("Digite um número para a variável A: ");
        Double b = Prompt.lerDecimal("Digite um outro número para a variável B: ");

        Double a2 = b;
        Double b2 = a;

        Prompt.imprimir("---Valores antigos---");
        Prompt.imprimir("A: " + a);
        Prompt.imprimir("B: " + b);
        Prompt.imprimir("  ");
        Prompt.imprimir("---Valores trocados---");
        Prompt.imprimir("A: " + a2);
        Prompt.imprimir("B: " + b2);

    }
}
