package package1;
import java.util.Scanner;

public class ContaCorrenteTeste {
    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente();
        novaConta.definirSaldoInicial(1000);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Ver saldo");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Finalizar");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Saldo atual: " + novaConta.saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a sacar:");
                    float valorSaque = scanner.nextFloat();
                    if (novaConta.sacar(valorSaque)) {
                        System.out.println("Saque de " + valorSaque + " reais realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor a depositar:");
                    float valorDeposito = scanner.nextFloat();
                    novaConta.depositar(valorDeposito);
                    System.out.println("Depósito de " + valorDeposito + " reais realizado com sucesso.");
                    break;
                case 4:
                    System.out.println("Sistema finalizado.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
