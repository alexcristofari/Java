package java1;
import java.util.Scanner;

// Escrever um algoritmo para ler quatro valores inteiros, calcular a sua
//m�dia, e escrever na tela os que s�o superiores � m�dia.

public class quatrovalores {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("Digite um numero: ");
		a = teclado.nextInt();
		System.out.println("Digite um numero: ");
		b = teclado.nextInt();
		System.out.println("Digite um numero: ");
		c = teclado.nextInt();
		System.out.println("Digite um numero: ");
		d = teclado.nextInt();
		
		double media =(a + b + c + d) / 4;
		
		System.out.printf("a m�dia: %.2f!", +media);
		
	}

}
