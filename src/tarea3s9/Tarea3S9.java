package tarea3s9;
import java.util.Scanner;
public class Tarea3S9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero de personas: ");
        int n = scanner.nextInt(); // Se lee el numero de personas
        double[] compras = new double[n]; //Crea un arreglo para las compras

        registrarCompras(compras, scanner); // Se registran las compras
        double total = calTotal(compras); // Calcula del total de compras
        double promedio = calPromedio(compras); // Se calcula el promedio de compras
        double mayor = comMayor(compras); // Se encuentra la compra mayor
        double menor = comMenor(compras); // Se encuentra la compra menor

        System.out.println("El total de compras es: " + total);
        System.out.println("El promedio de compras es: " + promedio);
        System.out.println("La compra mayor es: " + mayor);
        System.out.println("La compra menor es: " + menor);
    }

    public static void registrarCompras(double[] compras, Scanner scanner) {
        // Metodo para registrar las compras
        for (int i = 0; i < compras.length; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble(); // Se almacena cada compra
        }
    }
    
    public static double calTotal(double[] compras) {
        // Calculo del total de las compras
        double total = 0;
        for (double compra : compras) {
            total += compra; // Se suma cada compra
        }
        return total; // Se retorna el total
    }

    public static double calPromedio(double[] compras) {
        // Calculo del promedio de las compras
        return calTotal(compras) / compras.length; // Se calcula el promedio usando el total
    }
    public static double comMayor(double[] compras) {// Encontrar la compra mayor
        double mayor = compras[0]; // Se asume inicialmente la primera es la mayor
        for (double compra : compras) {
            if (compra > mayor) {
                mayor = compra; // Se actualiza si se encuentra una compra mayor
            }
        }
        return mayor;
    }
    public static double comMenor(double[] compras) {// Método para encontrar la compra menor
        double menor = compras[0]; // Se asume inicialmente que la primera es la menor
        for (double compra : compras) {
            if (compra < menor) {
                menor = compra; // Se actualiza si se encuentra una compra menor
            }
        }
        return menor;
    }
}

