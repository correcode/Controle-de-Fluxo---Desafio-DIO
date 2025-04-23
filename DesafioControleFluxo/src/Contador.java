import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try {
            contador(parametroUm, parametroDois);;
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parametro deve ser maior que o primeiro!");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
    }
    static void contador(int parametroUm, int parametroDois) {
        int contagem = parametroDois - parametroUm;

        for(int contadorFinal = 1; contadorFinal <= contagem; contadorFinal++) {
            System.out.println("Imprimindo o numero: " + contadorFinal);

        }
    }
}
