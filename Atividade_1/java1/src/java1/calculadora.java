package java1;
import java.util.Scanner;

//1 - Fa�a um programa para leitura de dois n�meros e ap�s fa�a as quatro opera��es
//matem�ticas (Soma, Subtra��o, Multiplica��o e divis�o)

public class calculadora {
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
	
