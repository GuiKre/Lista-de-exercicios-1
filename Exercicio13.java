public class Exercicio13 {
    
    public static void executar(){

        Double a = Prompt.lerDecimal("Digite um valor A: ");
        Double b = Prompt.lerDecimal("Digite um valor B: ");
        char op = Prompt.lerCaractere("Digite um operador: ");
        double resultado = 0;

        switch (op) {
            case '+': resultado = a + b; break;
            case '-': resultado = a - b; break;
            case '*': resultado = a * b; break;
            case '/': if(b == 0){
                Prompt.imprimir("Erro divisão por zero!");
                }else{
                    resultado = a / b;
                }; break;
            default: Prompt.imprimir("Operador não definido.");
                break;
        }

        Prompt.imprimir("Resultado da operação: " + resultado);
    }
}
