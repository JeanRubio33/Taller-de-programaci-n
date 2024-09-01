package tarea2s3;
import java.util.Scanner;
public class Tarea2S3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Estructura condicional doble
        if (edad >= 18 && edad <= 65) {
            System.out.println("Su solicitud de prestamo ha sido aprobada.");
        } else {
            System.out.println("Su solicitud de prestamo ha sido rechazada.");
        }
    }
}
     

