package atividade2;

//4 - Escreva um programa Java que use um laço para somar os números de 1 a 100.

public class ex4 {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
