package tarea1s9;
import java.util.Scanner;
public class Tarea1S9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de personas: ");
        int n = scanner.nextInt(); // Se lee el número de personas
        double[] pesos = new double[n]; // Se crea un arreglo para almacenar los pesos

        registrarPesos(pesos, scanner); // Llamada al metodo para registrar los pesos
        double promedio = calPromedio(pesos); // Se calcula el promedio de los pesos

        System.out.println("El peso promedio es: " + promedio);
    }

    public static void registrarPesos(double[] pesos, Scanner scanner) {
        // Método para registrar los pesos de las personas
        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble(); // Almacena cada peso en el arreglo
        }
    }
    // Método para calcular el promedio de los pesos
    public static double calPromedio(double[] pesos) {
        double suma = 0;
        for (double peso : pesos) {
            suma += peso; // Se suma cada peso
        }
        return suma / pesos.length; // Retorno del promedio
    }
}

