package java1;
import java.util.Scanner;

//Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual o maior deles.

public class tresvalores {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        double maiorValor = valor1;

        if (valor2 > maiorValor) {
            maiorValor = valor2;
        }

        if (valor3 > maiorValor) {
            maiorValor = valor3;
        }

        System.out.println("O maior valor é: " + maiorValor);

        scanner.close();
    }
	
		
	}


