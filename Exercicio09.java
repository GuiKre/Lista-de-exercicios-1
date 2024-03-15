public class Exercicio09 {
    
    public static void executar(){

        Double a = Prompt.lerDecimal("Digite um número para a variável A: ");
        Double b = Prompt.lerDecimal("Digite um número para a variável B: ");

        if(a > b){
            Prompt.imprimir("Os dois valores são diferentes, valor A(" + a +") maior que B(" + b +")");
        }else if(a < b){
            Prompt.imprimir("Os dois valores são diferentes, valor B(" + b +") maior que A(" + a +")");
        }else{
            Prompt.imprimir("Os dois valores são iguais!");
        }
    }
}
