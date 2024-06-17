import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("QUAL O SEU SALÁRIO ATUAL? ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("QUAL O VALOR QUE DESEJA EMPRESTAR? ");
        double valorRequerido = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(salarioAtual);

        Emprestimo.podeRealizarEmprestimo(pessoa.getSalarioAtual(), valorRequerido);

        scanner.close();
    }
}
