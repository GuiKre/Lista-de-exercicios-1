public class Exercicio08 {
    
    public static void executar(){

        Double num = Prompt.lerDecimal("Digite um número qualquer: ");

        if(num>50){
            Prompt.imprimir("O número digitado é maior que 50!");
        }else if(num==50){
            Prompt.imprimir("O número digitado é igual a 50");
        }else{
            Prompt.imprimir("O número digitado é menor que 50!");
        }
    }
}
