public class Exercicio07 {
    
    public static void executar(){

        Double num = Prompt.lerDecimal("Digite um número qualquer: ");

        if((num>=100)&(num<=200)){
            Prompt.imprimir("O número digitado está no intervalo entre 100 e 200.");
        }else{
            Prompt.imprimir("O número digitado não está no intervalo entre 100 e 200.");
        }
    }
}
