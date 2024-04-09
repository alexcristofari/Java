package atividade2;
import java.util.Scanner;

//8 - Escreva um programa Java que use um laço para ler vários nomes de cidades do usuário até que o nome "São Paulo" seja lido.

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome das cidades (digite \"São Paulo\" para encerrar):");

        String nomeCidade;

        do {
            System.out.print("Digite o nome da cidade: ");
            nomeCidade = scanner.nextLine();

            if (!nomeCidade.equalsIgnoreCase("São Paulo")) {
                System.out.println("Você digitou: " + nomeCidade);
            }

        } while (!nomeCidade.equalsIgnoreCase("São Paulo"));

        System.out.println("Programa encerrado.");

        scanner.close();
    }
}

