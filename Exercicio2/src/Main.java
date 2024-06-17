public class Main {
    public static void main(String[] args) {
        double salarioBruto = EntradaSaida.lerSalarioBruto();
        int horasExtras = EntradaSaida.lerHorasExtras();

        double descontoINSS = Calculo.calcularINSS(salarioBruto);
        double descontoIRPF = Calculo.calcularIRPF(salarioBruto);
        double descontoPlanoSaude = Calculo.calcularPlanoSaude(salarioBruto);
        double acrescimoHorasExtras = Calculo.calcularHorasExtras(salarioBruto, horasExtras);
        double salarioLiquido = Calculo.calcularSalarioLiquido(salarioBruto, descontoINSS, descontoIRPF, descontoPlanoSaude, acrescimoHorasExtras);

        EntradaSaida.mostrarFolhaPagamento(salarioBruto, descontoINSS, descontoIRPF, descontoPlanoSaude, acrescimoHorasExtras, salarioLiquido);
    }
}
