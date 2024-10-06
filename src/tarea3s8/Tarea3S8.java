package tarea3s8;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Tarea3S8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        // Crea un objeto DecimalFormat para formatear los numeros con 2 decimales
        System.out.print("Ingresa el monto del prestamo: ");
        double prestamo = sc.nextDouble();
        System.out.print("Ingresa la tasa de interes mensual (en porcentaje): ");
        double tasaInteres = sc.nextDouble();
        System.out.print("Ingresa numero de meses para pagar el prestamo: ");
        int meses = sc.nextInt();// Se ingresa el monto del prstamo, la tasa de interes y los meses

        tasaInteres /= 100;// Se convierte la tasa de interes en decimal
        double cuotaMes = (prestamo * tasaInteres) / (1 - Math.pow(1 + tasaInteres, -meses));
        // Calculo del monto de la cuota fija mensual usando la fórmula de amortización
        
        System.out.println("Plan de amortizacion: ");
        for (int i = 1; i <= meses; i++) {
            double intPagado = prestamo * tasaInteres; // Intereses del mes
            double capPagado = cuotaMes - intPagado; // Capital pagado del mes
            prestamo -= capPagado; // Resta lo pagado del prestamo
            
            System.out.println("Mes " + i + ": Cuota: " + df.format(cuotaMes) +
            ", Capital: " + df.format(capPagado) + ", Interes: " + df.format(intPagado) + 
            ", Saldo: " + df.format(prestamo));
        }   // Se muestra el detalle mes a mes de la amortizacion
    }
}

