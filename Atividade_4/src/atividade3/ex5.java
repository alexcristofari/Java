package atividade3;
import java.util.Scanner;

//5 - Fazer um algoritmo que leia trinta números reais armazenando-os em um vetor e após escreva a posição de cada número menor que zero desse vetor. Exemplo:

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[30];

        System.out.println("Digite trinta números reais:");

        for (int i = 0; i < 30; i++) {
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("Posições dos números menores que zero:");
        for (int i = 0; i < 30; i++) {
            if (numeros[i] < 0) {
                System.out.println(i);
            }
        }
    }
}

