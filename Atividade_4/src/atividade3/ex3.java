package atividade3;
import java.util.Scanner;

//3 - Escreva um algoritmo que leia valores para dois vetores de 20 elementos e então realize a soma dos elementos da mesma posição, armazenando o resultado em um outro vetor.

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[20];
        int[] vetor2 = new int[20];
        int[] soma = new int[20];

        System.out.println("Digite os valores para o primeiro vetor:");
        for (int i = 0; i < 20; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores para o segundo vetor:");
        for (int i = 0; i < 20; i++) {
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("A soma dos elementos na mesma posição é:");
        for (int valor : soma) {
            System.out.println(valor);
        }
    }
}

