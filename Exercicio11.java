public class Exercicio11 {

    public static void executar(){

        int num1 = Prompt.lerInteiro("Digite um número inteiro: ");
        int num2 = Prompt.lerInteiro("Digite um segundo número inteiro: ");
        int num3 = Prompt.lerInteiro("Digite um terceiro número inteiro: ");

        int aux;

        if(num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if(num2 > num3){
            aux = num2;
            num2 = num3;
            num3 = aux;
        }
        if(num1>num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        Prompt.imprimir("Valores em ordem crescente: " + num1 + ", " + num2 + ", " + num3);
    }
}
