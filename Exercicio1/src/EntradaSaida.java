import java.util.Scanner;
public class EntradaSaida {
    public static double obterNota(Scanner scanner, int numeroNota) {
        double nota;
        do {
            System.out.print("Informe a nota " + numeroNota + ": ");
            nota = scanner.nextDouble();
        } while (!Validacao.validarNota(nota));
        return nota;
    }

    public static double obterPeso(Scanner scanner, int numeroPeso) {
        double peso;
        do {
            System.out.print("Informe o peso da nota " + numeroPeso + ": ");
            peso = scanner.nextDouble();
        } while (!Validacao.validarPeso(peso));
        return peso;
    }
}
