public class Exercicio19 {

    public static void executar(){
        Double raio = Prompt.lerDecimal("Digite o raio do cilindro: ");
        Double altura = Prompt.lerDecimal("Digite a altura do cilindro: ");

        Double volume = 3.14 * Math.pow(raio, 2) * altura;

        Prompt.imprimir("Volume do cilindro: " + volume);
    }
}
