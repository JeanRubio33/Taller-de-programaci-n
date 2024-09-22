package ejericio1s6;
import java.util.Scanner;
public class Ejericio1S6 {

    public static void main(String[] args) {
        // Crea un objeto en Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Luego solicita el monto inicial
        System.out.print("Ingresa el monto inicial de ahorro: ");
        double montoInicial = scanner.nextDouble();

        // Solicita la cantidad que se ahorrara mensualmente
        System.out.print("Ingresa el monto mensual de ahorro: ");
        double montoMensual = scanner.nextDouble();

        // Solicita la cantidad que se quiere ahorrar
        System.out.print("Ingresa el objetivo de ahorro: ");
        double objetivo = scanner.nextDouble();

        // Inicializa el número de meses en 0
        int meses = 0;

        // Usa la estructura do-while para sumar los ahorros cada mes
        do {
            // Incrementa el ahorro actual
            montoInicial += montoMensual;

            // Incrementa el contador de meses
            meses++;
        } while (montoInicial < objetivo); // Condición: seguir hasta alcanzar o superar el objetivo

        // Muestra el número de meses necesarios
        System.out.println("Se necesitara " + meses + " meses para alcanzar tu objetivo de ahorro.");
    }
}

  

