package atividade2;

//9 - Escreva um programa Java que use um laço para imprimir os números primos de 1 a 50.

public class ex9 {
    public static void main(String[] args) {
        System.out.println("Números primos de 1 a 50:");

        for (int i = 2; i <= 50; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}

