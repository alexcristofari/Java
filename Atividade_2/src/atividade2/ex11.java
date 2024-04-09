package atividade2;

//11 - Escreva um programa em Java que gera números entre 1000 e 1999 e mostra aqueles que divididos por 11 dão resto 5.

public class ex11 {
    public static void main(String[] args) {
        System.out.println("Números entre 1000 e 1999 que, quando divididos por 11, deixam resto 5:");

        for (int i = 1000; i <= 1999; i++) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
        }
    }
}

