package tarea3s11;
import java.util.Random;
public class Tarea3S11 {

    public static void main(String[] args) {
        // Se crea una matriz de 4x4 para almacenar las ventas
        int[][] ventas = new int[4][4];
        int ventaMayor = 10; // Inicializamos con el valor minimo posible
        int ventaMenor = 5000; // Inicializamos con el valor maximo posible
        Random random = new Random();

        // Se genera las ventas aleatorias y almacenamos en la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = random.nextInt(4991) + 10; // Genera numeros entre 10 y 5000               
                if (ventas[i][j] > ventaMayor) {// Verifica si es la venta mayor o menor
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
        }
        // Se muestra la venta mayor y menor
        System.out.println("La venta mayor es: " + ventaMayor);
        System.out.println("La venta menor es: " + ventaMenor);
    }
}


