public class Exercicio14 {

    public static void executar(){

        Double a1 = Prompt.lerDecimal("Digite o termo a1 da progressão aritmética: ");
        Double n = Prompt.lerDecimal("Digite o número n da progressão aritmética: ");
        Double r = Prompt.lerDecimal("Digite a razão r da progressão aritmética: ");
        
        Double an = a1 + (n - 1) * r;

        Prompt.imprimir("an = " + an);
    }
}
