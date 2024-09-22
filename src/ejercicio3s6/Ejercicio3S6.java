package ejercicio3s6;
import java.util.Scanner;
public class Ejercicio3S6 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir entradas del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de inicio del rango
        System.out.print("Ingresa el número inicial del rango: ");
        int inicio = scanner.nextInt();

        // Solicitar el número final del rango
        System.out.print("Ingresa el número final del rango: ");
        int fin = scanner.nextInt();

        // Inicializar la suma
        int suma = 0;

        // Usar do-while para sumar los números pares en el rango
        do {
            // Verificar si el número es par
            if (inicio % 2 == 0) {
                // Si es par, se agrega a la suma
                suma += inicio;
            }

            // Incrementar el número
            inicio++;
        } while (inicio <= fin); // Condición: seguir mientras el número esté dentro del rango

        // Mostrar el resultado
        System.out.println("La suma de los números pares en el rango es: " + suma);
    }
}

  
