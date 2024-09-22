package ejercicio2s6;
import java.util.Scanner;
public class Ejercicio2S6 {

    public static void main(String[] args) {
        // Crea un objeto Scanner para recibir entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicita el capital inicial
        System.out.print("Ingresa el capital inicial: ");
        double capital = scanner.nextDouble();

        // Solicita la tasa de interes anual en porcentaje
        System.out.print("Ingresa la tasa de interes anual (%): ");
        double tasaInteres = scanner.nextDouble() / 100;

        // Solicita el numero de años
        System.out.print("Ingresa el numero de años: ");
        int años = scanner.nextInt();

        // Inicializa el año en 1
        int año = 1;

        // Usar la estructura while para aplicar el interes compuesto cada año
        while (año <= años) {
            // Calcula el interes de ese año
            capital += capital * tasaInteres;

            // Muestra el capital al final de cada año
            System.out.println("Año " + año + ": " + capital);

            // Incrementa el contador de años
            año++;
        }
    }
}

    
