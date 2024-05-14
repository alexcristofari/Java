package atividade3;
import java.util.Scanner;

//8 - Escreva um programa em Java que leia os valores de uma matriz 4x3, e em seguida mostre na tela apenas os valores cuja soma dos índices (i+j) seja um número par.

public class ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][3];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Valores cuja soma dos índices (i+j) é par:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.println("Valor na posição [" + i + "][" + j + "]: " + matriz[i][j]);
                }
            }
        }

        scanner.close();
    }
}

