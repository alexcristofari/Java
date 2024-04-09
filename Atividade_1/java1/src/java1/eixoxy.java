package java1;
import java.util.Scanner;

//5 - Escreva um algoritmo que leia um ponto (x,y) pelo teclado e informe em
//qual quadrante o ponto se encontra no plano cartesiano ou se o ponto está
//sobre um dos eixos.

public class eixoxy {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x,y;
		
		System.out.println("Digite o eixo x: ");
		x = teclado.nextInt();
		System.out.println("Digite o eixo y: ");
		y = teclado.nextInt();
		
		if(x>=1&&y>=1){
			System.out.println("O ponto está no quadrante 1 ");
			}
		if(x>=1&&y<=1){
			System.out.println("O ponto está no quadrante 4 ");
			}
		if(x<=1&&y>=1){
			System.out.println("O ponto está no quadrante 2 ");
			}
		if(x<=1&&y<=1){
			System.out.println("O ponto está no quadrante 3 ");
			}
		if(x==0||y==0){
			System.out.println("e/ou o  ponto está sobre um dos eixos ");
			}
		
		
	}

}
