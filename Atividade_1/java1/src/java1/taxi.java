package java1;
import java.util.Scanner;

//2 - Um motorista de taxi deseja calcular o rendimento de seu carro na praça. Sabendose que o preço do combustível é de R$4,90, escreva um algoritmo para ler a marcação
//do odômetro (marcador de quilometragem) no início do dia, a marcação no final do dia, o
//número de litros de combustível gasto e o valor total (R$) recebido dos passageiros.
//Calcule e escreva a média do consumo em Km/l e o lucro líquido do dia.

public class taxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marcação do odômetro no início do dia (em km): ");
        double inicioDia = scanner.nextDouble();
        
        System.out.print("Digite a marcação do odômetro no final do dia (em km): ");
        double finalDia = scanner.nextDouble();

        System.out.print("Digite o número de litros de combustível gasto: ");
        double litrosCombustivel = scanner.nextDouble();

        System.out.print("Digite o valor total (R$) recebido dos passageiros: ");
        double valorTotalRecebido = scanner.nextDouble();

        double kmPercorridos = finalDia - inicioDia;
        double mediaConsumo = kmPercorridos / litrosCombustivel;

        double lucroLiquido = valorTotalRecebido - (litrosCombustivel * 4.90); // Preço do combustível: R$4,90 por litro

        System.out.println("Média do consumo: " + mediaConsumo + " Km/l");
        System.out.println("Lucro líquido do dia: R$" + lucroLiquido);

        scanner.close();
    }
}