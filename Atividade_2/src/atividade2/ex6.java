package atividade2;
import java.util.Scanner;

//6- Escreva um programa Java que use um laço para ler uma sequência de números inteiros do usuário até que o número 0seja lido.

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma sequência de números inteiros (digite 0 para encerrar):");

        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                System.out.println("Você digitou: " + numero);
            }

        } while (numero != 0);

        System.out.println("Programa encerrado.");

        scanner.close();
    }
}
