package atividade2;
import java.util.Scanner;

//10 - Escreva um programa Java que use um laço para calcular a média de vários números reais lidos do usuário até que seja lido o número 0.

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite vários números reais (digite 0 para encerrar):");

        double numero;
        double soma = 0;
        int contador = 0;

        do {
            System.out.print("Digite um número real: ");
            numero = scanner.nextDouble();

            if (numero != 0) {
                soma += numero;
                contador++;
            }

        } while (numero != 0);

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("A média dos números reais inseridos é: " + media);
        } else {
            System.out.println("Nenhum número real foi inserido.");
        }

        scanner.close();
    }
}
