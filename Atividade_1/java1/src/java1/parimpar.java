package java1;
import java.util.Scanner;

//3 - Fa�a um algoritmo para ler um n�mero e verificar se ele � par ou �mpar.

public class parimpar {
	public static void main(String[] args) {
		//System.out.println();
			
		System.out.println("Digite um numero:");
		Scanner teclado = new Scanner(System.in); 
		int n = teclado.nextInt();
		
		if((n % 2) == 0){
			System.out.println("� par:");
		}
		else{
			System.out.println("� impar:");
		}
	}
}
	
	
	
	

