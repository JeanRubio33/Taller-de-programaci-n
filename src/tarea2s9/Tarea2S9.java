package tarea2s9;
import java.util.Scanner;
public class Tarea2S9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de personas: ");
        int n = scanner.nextInt(); // Se lee el numero de personas
        double[] ingresos = new double[n]; // Se crea un arreglo para los ingresos

        regIngresos(ingresos, scanner); // Se registran los ingresos
        double promedio = calPromedio(ingresos); // Se calcula el promedio de los ingresos
        double mayor = SMayor(ingresos); // Se encuentra el ingreso mayor

        System.out.println("El ingreso promedio es: " + promedio);
        System.out.println("El ingreso mayor es: " + mayor);
    }

    public static void regIngresos(double[] ingresos, Scanner scanner) {
        // Metodo para registrar los ingresos
        for (int i = 0; i < ingresos.length; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = scanner.nextDouble(); // Se almacena cada ingreso
        }
    }
   
    public static double calPromedio(double[] ingresos) {
        // Método para calcular el promedio de los ingresos
        double suma = 0;
        for (double ingreso : ingresos) {
            suma += ingreso; // Se suma cada ingreso
        }
        return suma / ingresos.length; // Retorna el promedio
    }
    
    public static double SMayor(double[] ingresos) {
        // Método para encontrar el ingreso mayor
        double mayor = ingresos[0]; // Se asume inicialmente que el primero es el mayor
        for (double ingreso : ingresos) {
            if (ingreso > mayor) {
                mayor = ingreso; // Se muestra el mayor si se encuentra uno mas grande
            }
        }
        return mayor; // Se retorna el ingreso mayor
    }
}


