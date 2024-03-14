public class Exercicio02 {

    public static void executar(){
        
        Double numero1 = Prompt.lerDecimal("Digite um número: ");
        Double numero2 = Prompt.lerDecimal("Digite um segundo número: ");

        Prompt.imprimir("A soma dos dois números é: " + (numero1 + numero2));
    }
}
