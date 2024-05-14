package package1;
import java.util.Scanner;

public class executavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a marca do primeiro carro:");
        String marca1 = scanner.nextLine();

        System.out.println("Informe o modelo do primeiro carro:");
        String modelo1 = scanner.nextLine();

        System.out.println("Informe o ano de fabricação do primeiro carro:");
        int anoFabricacao1 = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Informe a marca do segundo carro:");
        String marca2 = scanner.nextLine();

        System.out.println("Informe o modelo do segundo carro:");
        String modelo2 = scanner.nextLine();

        System.out.println("Informe o ano de fabricação do segundo carro:");
        int anoFabricacao2 = scanner.nextInt();

        Carro carro1 = new Carro(marca1, modelo1, anoFabricacao1);
        Carro carro2 = new Carro(marca2, modelo2, anoFabricacao2);

        System.out.println("\nInformações do primeiro carro:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano de Fabricação: " + carro1.getAnoFabricacao());

        System.out.println("\nInformações do segundo carro:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano de Fabricação: " + carro2.getAnoFabricacao());

        scanner.close();
    }
}
