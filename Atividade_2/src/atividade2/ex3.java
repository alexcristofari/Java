package atividade2;

//3 - Escreva um programa Java que use um laço para imprimir a tabuada do 7.

public class ex3 {
    public static void main(String[] args) {
        int numero = 7;

        System.out.println("Tabuada do 7:");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}

