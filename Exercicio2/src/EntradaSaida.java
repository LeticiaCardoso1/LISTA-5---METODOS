import java.util.Scanner;

public class EntradaSaida {
    private static Scanner sc = new Scanner(System.in);

    public static double lerSalarioBruto() {
        System.out.print("DIGITE O VALOR DO SEU SALÁRIO BRUTO: ");
        return sc.nextDouble();
    }

    public static int lerHorasExtras() {
        System.out.print("DIGITE A SUA QUANTIDADE DE HORAS EXTRAS: ");
        return sc.nextInt();
    }

    public static void mostrarFolhaPagamento(double salarioBruto, double descontoINSS, double descontoIRPF, double descontoPlanoSaude, double acrescimoHorasExtras, double salarioLiquido) {
        System.out.println("\nHOLERITE:");
        System.out.println("SALÁRIO BRUTO: R$" + salarioBruto);
        System.out.println("DESCONTO INSS: R$" + descontoINSS);
        System.out.println("DESCONTO IRPF: R$" + descontoIRPF);
        System.out.println("DESCONTO DO PLANO DE SAÚDE: R$" + descontoPlanoSaude);
        System.out.println("VALOR RECEBIDO PELAS HORAS EXTRAS: R$" + acrescimoHorasExtras);
        System.out.println("SALÁRIO LÍQUIDO: R$" + salarioLiquido);
    }
}
