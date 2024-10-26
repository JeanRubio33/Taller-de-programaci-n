package tarea4s11;
import java.util.Random;
public class Tarea4S11 {

    public static void main(String[] args) {
        // Crea una matriz de 3x3 para almacenar las ventas
        int[][] ventas = new int[3][3];
        int total = 0;
        int cant = 0;
        Random random = new Random();
        // Genera ventas aleatorias y almacena en la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = random.nextInt(9001) + 1000; // Genera numeros entre 1000 y 10000
                total += ventas[i][j]; // Sumamos cada venta al total
                cant++; // Contamos cada venta para el promedio
            }
        }
        // Calcula el promedio de las ventas
        double promedio = (double) total / cant;
        // Se muestra el total y el promedio de las ventas
        System.out.println("El total de las ventas es: " + total);
        System.out.println("El promedio de las ventas es: " + promedio);
    }
}

