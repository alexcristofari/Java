package package1;
import java.util.Scanner;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    public Pessoa(int idade) {
        this.idade = idade;
        System.out.println("Idade: " + this.idade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual construtor você gostaria de utilizar? (1 - Nome e Idade, 2 - Apenas Idade)");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            scanner.nextLine(); 
            System.out.println("Digite o nome:");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();
            Pessoa pessoa1 = new Pessoa(nome, idade);
        } else if (opcao == 2) {
            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();
            Pessoa pessoa2 = new Pessoa(idade);
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
