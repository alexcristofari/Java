package package1;
import java.util.Scanner;

public class Executavel2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a marca do primeiro computador:");
        String marca1 = scanner.nextLine();

        System.out.println("Informe o modelo do primeiro computador:");
        String modelo1 = scanner.nextLine();

        System.out.println("Informe o tipo do primeiro computador:");
        String tipo1 = scanner.nextLine();

        System.out.println("Informe o preço do primeiro computador:");
        double preco1 = scanner.nextDouble();

        Computador computador1 = new Computador(marca1, modelo1, tipo1, preco1);

        Computador computador2 = new Computador("Dell", "Inspiron", "Notebook", 2500.00);

        System.out.println("\nInformações do primeiro computador:");
        System.out.println("Marca: " + computador1.getMarca());
        System.out.println("Modelo: " + computador1.getModelo());
        System.out.println("Tipo: " + computador1.getTipo());
        System.out.println("Preço: $" + computador1.getPreco());

        System.out.println("\nInformações do segundo computador:");
        System.out.println("Marca: " + computador2.getMarca());
        System.out.println("Modelo: " + computador2.getModelo());
        System.out.println("Tipo: " + computador2.getTipo());
        System.out.println("Preço: $" + computador2.getPreco());

        scanner.close();
    }
}
