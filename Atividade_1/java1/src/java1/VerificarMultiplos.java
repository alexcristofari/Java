package java1;
import java.util.Scanner;

//Escreva um algoritmo que leia dois valores pelo teclado e informe se os mesmos s�o m�ltiplos um do outro ou n�o.

public class VerificarMultiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Os valores s�o m�ltiplos um do outro.");
        } else {
            System.out.println("Os valores n�o s�o m�ltiplos um do outro.");
        }

        scanner.close();
    }
}

