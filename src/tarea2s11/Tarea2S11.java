package tarea2s11;
import java.util.Scanner;
public class Tarea2S11 {

    public static void main(String[] args) {
        // Se crea una matriz de 4x4 para almacenar las compras
        int[][] compras = new int[4][4];
        int total = 0;
        int cant = 0;
        Scanner scanner = new Scanner(System.in);

        // Se ingresa las compras para cada posicion de la matriz
        System.out.println("Ingrese las compras para cada posicion de la matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Compra [" + i + "][" + j + "]: ");
                compras[i][j] = scanner.nextInt();
                total += compras[i][j]; // Suma cada compra al total
                cant++; // Cuenta cada compra para el promedio
            }
        }
        // Calculamos el promedio de las compras
        double promedio = (double) total / cant;
        // Se muestra el total y el promedio de las compras
        System.out.println("El total de las compras es: " + total);
        System.out.println("El promedio de las compras es: " + promedio);
    }
}


