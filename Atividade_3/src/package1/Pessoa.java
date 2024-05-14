package package1;

public class Pessoa {
    private String nome;
    private int idade;
    private String genero;

    public Pessoa(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + genero);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, "Masculino");
        pessoa.imprimirInformacoes();
    }
}
