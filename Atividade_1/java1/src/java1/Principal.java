package java1;
import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		
			  Scanner ler = new Scanner(System.in); 
			  int a, b;

			  System.out.println("Informe o primeiro valor: ");
			  a = ler.nextInt(); 

			  System.out.println("Informe o segundo valor: ");
			  b = ler.nextInt(); 

			  System.out.printf("\nResultados:\n");
			  System.out.printf("%d + %d = %3d\n", a, b, (a + b));
			  System.out.printf("%d - %d = %3d\n", a, b, (a - b));
			  System.out.printf("%d * %d = %3d\n", a, b, (a * b));
			  System.out.printf("%d / %d = %3d\n", a, b, (a / b));
			  } 
		 }
	
