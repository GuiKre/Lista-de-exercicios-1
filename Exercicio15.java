public class Exercicio15 {

    public static void executar(){

        Double x1 = Prompt.lerDecimal("Digite a coordenada x1 do ponto P1: ");
        Double y1 = Prompt.lerDecimal("Digite a coordenada y1 do ponto P1: ");
        Double x2 = Prompt.lerDecimal("Digite a coordenada x2 do ponto P2: ");
        Double y2 = Prompt.lerDecimal("Digite a coordenada y2 do ponto P2: ");

        Double distancia = Math.sqrt(Math.pow((x2 = x1), 2) + Math.pow((y2 - y1), 2));

        Prompt.imprimir("Distância entre os pontos P1 e P2: " + distancia);
    }
}
