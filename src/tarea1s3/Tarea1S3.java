package tarea1s3;
import java.util.Scanner;

public class Tarea1S3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos comprados: ");
        int cantidadProductos = scanner.nextInt();

        // Estructura condicional simple
        if (cantidadProductos > 5) {
            System.out.println("Es elegible para un descuento del 10%.");
        }
    }
}
