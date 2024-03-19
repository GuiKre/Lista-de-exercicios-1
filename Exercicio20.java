public class Exercicio20 {

    public static void executar(){

        Double tempo = Prompt.lerDecimal("Digite o tempo da viagem em horas: ");
        Double vlcmedia = Prompt.lerDecimal("Digite a velocidade média da viagem em km/h: ");

        Double distancia = tempo * vlcmedia;

        Double consumo = 12.0;

        Double gasto = distancia / consumo;

        Prompt.imprimir("Litros de combustível gasto: " + gasto);
    }
}
