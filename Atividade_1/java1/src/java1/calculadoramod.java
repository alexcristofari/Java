package java1;
import java.util.Scanner;

public class calculadoramod {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int a, b;
        char operacao;

        System.out.println("Informe o primeiro valor: ");
        a = ler.nextInt();

        System.out.println("Informe o segundo valor: ");
        b = ler.nextInt();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");

        operacao = ler.next().charAt(0);

        double resultado = 0;

        switch (operacao) {
            case '1':
            case '+':
                resultado = a + b;
                break;
            case '2':
            case '-':
                resultado = a - b;
                break;
            case '3':
            case '*':
                resultado = a * b;
                break;
            case '4':
            case '/':
                if (b != 0) {
                    resultado = (double) a / b;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.printf("Resultado: %d %c %d = %.2f\n", a, operacao, b, resultado);

        ler.close();
    }
}
