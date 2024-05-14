package atividade3;
import java.util.Scanner;

//10 – No exercício anterior altere para que verifique se a soma dos elementos da diagonal principal é igual a soma dos elementos da diagonal secundária.

public class ex10 {

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
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][i] + " ");
            somaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println();

        System.out.println("Valores da diagonal secundária:");
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][4 - i] + " ");
            somaDiagonalSecundaria += matriz[i][4 - i];
        }
        System.out.println();

        if (somaDiagonalPrincipal == somaDiagonalSecundaria) {
            System.out.println("A soma dos elementos da diagonal principal é igual à soma dos elementos da diagonal secundária.");
        } else {
            System.out.println("A soma dos elementos da diagonal principal não é igual à soma dos elementos da diagonal secundária.");
        }

        scanner.close();
    }
}
