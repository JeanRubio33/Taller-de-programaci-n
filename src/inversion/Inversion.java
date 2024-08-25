
package inversion;

public class Inversion {
    public static void main(String[] args) {
        double capitalInicial = 15000; // Capital inicial en dólares
        double tasaInteresAnual = 0.0525; // Tasa de interés anual en porcentaje
        int años = 8; // Tiempo de la inversión en años
        int vecesCompuestoAnual = 1; // Número de veces que se compone el interés al año

        double valorFuturo = calcularValorFuturo(capitalInicial, tasaInteresAnual, vecesCompuestoAnual, años);
        System.out.printf("El valor futuro de la inversión es: $%.2f\n", valorFuturo);
    }
    public static double calcularValorFuturo(double P, double r, int n, int t) {
        return P * Math.pow(1 + (r / n), n * t);
    }
}

