import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int pUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int pDois = scan.nextInt();

        try {
            contar(pUm, pDois);
        } catch (ParametrosInvalidosException exception) {
            System.err.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.printf("Imprimindo o número %s\n", i + 1);
        }
    }
}
