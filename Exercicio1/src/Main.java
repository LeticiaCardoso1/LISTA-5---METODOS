import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = EntradaSaida.obterNota(scanner, 1);
        double nota2 = EntradaSaida.obterNota(scanner, 2);

        System.out.println("Qual média deseja calcular? (1 para aritmética, 2 para ponderada)");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            double media = Calculo.calcularMediaAritmetica(nota1, nota2);
            Resultado.mostrarResultado(media);
        } else if (escolha == 2) {
            double peso1 = EntradaSaida.obterPeso(scanner, 1);
            double peso2 = EntradaSaida.obterPeso(scanner, 2);
            double media = Calculo.calcularMediaPonderada(nota1, nota2, peso1, peso2);
            Resultado.mostrarResultado(media);
        } else {
            System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
