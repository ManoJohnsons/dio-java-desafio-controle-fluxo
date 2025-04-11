import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parametroUm = 0, parametroDois = 0;
        System.out.println("========== Contador ==========");

        while (true) {
            try {
                System.out.print("Digite o primeiro parâmetro: ");
                parametroUm = sc.nextInt();
                System.out.print("Digite o segundo parâmetro: ");
                parametroDois = sc.nextInt();

                contar(parametroUm, parametroDois);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Deve-se digitar apenas números inteiros.");
                sc.nextLine();
            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            }
        }

        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
