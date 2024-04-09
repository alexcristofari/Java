package java1;
import java.util.Scanner;

// Ajuste o exercício 6 de maneira que mostre os valores informados em ordem crescente.

public class ordemcrescente {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        if (valor1 > valor2) {
            double temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        if (valor2 > valor3) {
            double temp = valor2;
            valor2 = valor3;
            valor3 = temp;
        }

        if (valor1 > valor2) {
            double temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2 + ", " + valor3);

        scanner.close();
    }
}


