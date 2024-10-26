package tarea1s11;
import java.util.Scanner;
public class Tarea1S11 {
    public static void main(String[] args) {
        
        int[][] ventas = new int[4][4];// Creamos una matriz de 4x4 para almacenar las ventas
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        // Se ingresa las ventas para cada posicion de la matriz
        System.out.println("Ingrese las ventas para cada posicion de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Venta [" + i + "][" + j + "]: ");
                ventas[i][j] = scanner.nextInt();
                total += ventas[i][j]; // Sumamos cada venta al total
            }
        }
        // Muestra el total de las ventas
        System.out.println("El total de las ventas es: " + total);
    }
}


