public class Validacao {
    public static boolean validarNota(double nota) {
        return nota >= 0 && nota <= 10;
    }

    public static boolean validarPeso(double peso) {
        return peso > 0;
    }
}
