package atividade2;
import java.util.Scanner;

//12 - Faça um programa em Java que leia um número inteiro n, inteiro e positivo e mostre a seguinte soma: S = 1 + 1/2 + 1/3 + 1/4 + 1/5 .... 1/n


public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo (n): ");
        int n = scanner.nextInt();

        if (n > 0) {
            double soma = 0.0;

            for (int i = 1; i <= n; i++) {
                soma += 1.0 / i;
            }

            System.out.println("A soma da sequência é: " + soma);
        } else {
            System.out.println("Por favor, digite um número inteiro positivo.");
        }

        scanner.close();
    }
}

