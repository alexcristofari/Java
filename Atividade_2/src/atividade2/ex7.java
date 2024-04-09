package atividade2;
import java.util.Scanner;

//7 - Escreva um programa Java que use um laço para ler a nota de vários alunos até que seja lida a nota -1.

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as notas dos alunos (digite -1 para encerrar):");

        double nota;
        int contadorAlunos = 0;
        double somaNotas = 0;

        do {
            System.out.print("Digite a nota do aluno (ou -1 para encerrar): ");
            nota = scanner.nextDouble();

            if (nota != -1) {
                somaNotas += nota;
                contadorAlunos++;
            }

        } while (nota != -1);

        if (contadorAlunos > 0) {
            double media = somaNotas / contadorAlunos;
            System.out.println("A média das notas dos alunos é: " + media);
        } else {
            System.out.println("Nenhuma nota foi inserida.");
        }

        scanner.close();
    }
}

