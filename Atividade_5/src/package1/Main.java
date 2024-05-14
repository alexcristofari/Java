package package1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente();
        novaConta.definirSaldoInicial(1000);
        Aluno aluno1 = new Aluno("João", "2021001");
        Aluno aluno2 = new Aluno(new Date(2000, 5, 15));
        Aluno aluno3 = new Aluno("Maria", new Date(1999, 9, 20), 2022);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());

        System.out.println("\nAluno 2:");
        System.out.println("Data de Nascimento: " + aluno2.getDataNascimento());

        System.out.println("\nAluno 3:");
        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Data de Nascimento: " + aluno3.getDataNascimento());
        System.out.println("Ano de Ingresso: " + aluno3.getAnoIngresso());
    }
}