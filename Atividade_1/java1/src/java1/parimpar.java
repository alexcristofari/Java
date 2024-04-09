package java1;
import java.util.Scanner;

//3 - Faça um algoritmo para ler um número e verificar se ele é par ou ímpar.

public class parimpar {
	public static void main(String[] args) {
		//System.out.println();
			
		System.out.println("Digite um numero:");
		Scanner teclado = new Scanner(System.in); 
		int n = teclado.nextInt();
		
		if((n % 2) == 0){
			System.out.println("é par:");
		}
		else{
			System.out.println("é impar:");
		}
	}
}
	
	
	
	

