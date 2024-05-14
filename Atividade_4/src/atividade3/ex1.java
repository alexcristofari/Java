package atividade3;
import java.util.Scanner;

//1 - Fazer um algoritmo que leia dez números e escreva-os na ordem contrária à ordem de leitura.

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite dez números:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números na ordem inversa:");

        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

