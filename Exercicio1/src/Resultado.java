public class Resultado {
    public static void mostrarResultado(double media) {
        if (media >= 7) {
            System.out.println("Aluna(o) aprovada(o) com média igual a " + media);
        } else {
            System.out.println("Aluna(o) reprovada(o) com média igual a " + media);
        }
    }
}
