package atividade3;
import java.util.Scanner;

//7 - Escreva um programa Java que use uma matriz para armazenar as notas de 3 alunos em 4 disciplinas e depois imprima na tela a nota mais alta e a nota mais baixa em cada disciplina.

public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[3][4];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota da disciplina " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        for (int j = 0; j < 4; j++) {
            double notaMaisAlta = notas[0][j];
            double notaMaisBaixa = notas[0][j];

            for (int i = 1; i < 3; i++) {
                if (notas[i][j] > notaMaisAlta) {
                    notaMaisAlta = notas[i][j];
                }
                if (notas[i][j] < notaMaisBaixa) {
                    notaMaisBaixa = notas[i][j];
                }
            }

            System.out.println("Disciplina " + (j + 1) + ":");
            System.out.println("Nota mais alta: " + notaMaisAlta);
            System.out.println("Nota mais baixa: " + notaMaisBaixa);
        }

        scanner.close();
    }
}
