public class Emprestimo {
    public static final double JUROS_TOTAIS = 0.35;
    public static final double LIMITE_PERCENTUAL_SALARIO = 0.15;

    private static double calcularTotalEmprestimo(double valorRequerido) {
        return valorRequerido * (1 + JUROS_TOTAIS);
    }

    private static double calcularValorParcela(double totalEmprestimo) {
        return totalEmprestimo / 24;
    }

    public static boolean podeRealizarEmprestimo(double salarioAtual, double valorRequerido) {
        if (valorRequerido > 500000) {
            System.out.println("O VALOR MÁXIMO QUE PODERÁ SOLICITAR É 500 mil.");
            return false;
        }

        double totalEmprestimo = calcularTotalEmprestimo(valorRequerido);
        double valorParcela = calcularValorParcela(totalEmprestimo);
        double limiteParcela = salarioAtual * LIMITE_PERCENTUAL_SALARIO;

        if (valorParcela > limiteParcela) {
            System.out.println("O seu empréstimo não foi aprovado. Tente fazer uma ánalise novamente daqui 90 dias.");
            return false;
        }

        System.out.println("EMPRÉSTIMO APROVADO!");
        System.out.println("VALOR DE CADA PARCELA: R$ " + String.format("%.2f", valorParcela));
        System.out.println("VALOR TOTAL A PAGAR: R$ " + String.format("%.2f", totalEmprestimo));

        return true;
    }
}
