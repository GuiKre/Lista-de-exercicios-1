public class Exercicio01 {

    public static void executar(){

        Double numero = Prompt.lerDecimal("Digite um número: ");

        if(numero<=10){
            Prompt.imprimir("Numero menor ou igual a 10!");
        }else{
            Prompt.imprimir("Número maior do que 10!");
        }

    }
}
