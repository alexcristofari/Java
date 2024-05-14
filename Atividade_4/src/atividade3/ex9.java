package atividade3;
import java.util.Scanner;

//9 - Escreva um programa em Java que faça leitura dos valores de uma matriz 5x5. Em seguida apresente os valores da diagonal principal. Na sequência, apresente os valores da diagonal secundária

public class ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Valores da diagonal principal:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        System.out.println("Valores da diagonal secundária:");
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][4 - i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
