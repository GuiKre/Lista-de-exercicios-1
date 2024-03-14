public class Exercicio03 {

    public static void executar(){
        int a = Prompt.lerInteiro("Digite um número inteiro A: ");
        int b = Prompt.lerInteiro("Digite um segundo número inteiro B: ");

        if(a>b){
            Prompt.imprimir("Número A maior que número B!");
        }else if(b>a){
            Prompt.imprimir("Número B maior que número A!");
        }else{
            Prompt.imprimir("Sequência de números informados é invalida!");
        }
    }
}
