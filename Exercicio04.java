public class Exercicio04 {

    public static void executar(){
        
        Double num1 = Prompt.lerDecimal("Digite um número: ");
        Double num2 = Prompt.lerDecimal("Digite um segundo número: ");

        Prompt.imprimir("A soma dos números digitados é: "+ (num1 + num2));
        Prompt.imprimir("A subtração dos números digitados é: " + (num1 - num2));
        Prompt.imprimir("A multiplicação dos números digitados é: " + (num1 * num2));
        Prompt.imprimir("A divisão dos números digitados é: " + (num1 / num2));
    }
}
