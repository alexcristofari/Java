package java1;
import java.util.Scanner;

//Escreva um algoritmo para ler a idade de uma pessoa e mostrar qual sua situa��o de eleitor, conforme as seguintes condi��es:�
//Se a idade for menor que 16 anos, informar que a pessoa n�o est� apta a votar.�
//Se a idade for maior ou igual a 16 anos e menor que 18 anos ou superior a 70 anos, informar que o voto � facultativo.�
//Caso contr�rio, informar que o voto � obrigat�rio. 1

public class SituacaoEleitoral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("A pessoa n�o est� apta a votar.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("O voto � facultativo.");
        } else {
            System.out.println("O voto � obrigat�rio.");
        }

        scanner.close();
    }
}
