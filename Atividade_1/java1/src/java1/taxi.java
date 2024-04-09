package java1;
import java.util.Scanner;

//2 - Um motorista de taxi deseja calcular o rendimento de seu carro na pra�a. Sabendose que o pre�o do combust�vel � de R$4,90, escreva um algoritmo para ler a marca��o
//do od�metro (marcador de quilometragem) no in�cio do dia, a marca��o no final do dia, o
//n�mero de litros de combust�vel gasto e o valor total (R$) recebido dos passageiros.
//Calcule e escreva a m�dia do consumo em Km/l e o lucro l�quido do dia.

public class taxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca��o do od�metro no in�cio do dia (em km): ");
        double inicioDia = scanner.nextDouble();
        
        System.out.print("Digite a marca��o do od�metro no final do dia (em km): ");
        double finalDia = scanner.nextDouble();

        System.out.print("Digite o n�mero de litros de combust�vel gasto: ");
        double litrosCombustivel = scanner.nextDouble();

        System.out.print("Digite o valor total (R$) recebido dos passageiros: ");
        double valorTotalRecebido = scanner.nextDouble();

        double kmPercorridos = finalDia - inicioDia;
        double mediaConsumo = kmPercorridos / litrosCombustivel;

        double lucroLiquido = valorTotalRecebido - (litrosCombustivel * 4.90); // Pre�o do combust�vel: R$4,90 por litro

        System.out.println("M�dia do consumo: " + mediaConsumo + " Km/l");
        System.out.println("Lucro l�quido do dia: R$" + lucroLiquido);

        scanner.close();
    }
}