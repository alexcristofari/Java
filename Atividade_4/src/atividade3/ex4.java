package atividade3;
import java.util.Scanner;
import java.util.ArrayList;

//4 - Fazer um algoritmo que leia dez números inteiros armazenando-os em um vetor e escreva primeiramente todos os números pares lidos e após todos os ímpares. Exemplo:


public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Digite dez números inteiros:");

        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        System.out.println("Números pares seguidos pelos ímpares:");
        for (int numero : pares) {
            System.out.println(numero);
        }
        for (int numero : impares) {
            System.out.println(numero);
        }
    }
}

