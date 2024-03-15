public class Exercicio06 {
    
    public static void executar(){

        Double c = Prompt.lerDecimal("Digite a temperatura em gruas Celcius: ");

        Double f = (9 * c + 160) / 5;

        Prompt.imprimir("Temperatura em graus Fahrenheit: " + f + "°F");

    }
}
