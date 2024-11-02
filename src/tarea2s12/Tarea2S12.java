package tarea2s12;
import java.util.Scanner;
public class Tarea2S12 {

    // Atributos para las compras 
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;
    // Modelo Constructor
    public Tarea2S12(double compra1, double compra2, double compra3, double compra4) {
        this.compra1 = compra1;
        this.compra2 = compra2;
        this.compra3 = compra3;
        this.compra4 = compra4;
    }
    // Metodo para calcular el total de las compras
    public double calcularTotal() {
        return compra1 + compra2 + compra3 + compra4;
    }
    // Metodo para calcular el promedio de las compras
    public double calcularPromedio() {
        return calcularTotal() / 4;
    }
    // Metodo para obtener la compra de mayor valor
    public double obtenerMayor() {
        return Math.max(Math.max(compra1, compra2), Math.max(compra3, compra4));
    }
    // Metodo para obtener la compra de menor valor
    public double obtenerMenor() {
        return Math.min(Math.min(compra1, compra2), Math.min(compra3, compra4));
    }
    // Metodo para mostrar el resumen de las compras
    public void mostrarResumenCompras() {
        System.out.println("RESULTADOS: " );
        System.out.println("Total de las compras: " + calcularTotal());
        System.out.println("Promedio de las compras: " + calcularPromedio());
        System.out.println("Compra mayor: " + obtenerMayor());
        System.out.println("Compra menor: " + obtenerMenor());
    }
    // Metodo principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // El usuario ingresa cada compra
        System.out.print("Ingrese el valor de la compra 1: ");
        double compra1 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la compra 2: ");
        double compra2 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la compra 3: ");
        double compra3 = scanner.nextDouble();
        System.out.print("Ingrese el valor de la compra 4: ");
        double compra4 = scanner.nextDouble();
        // Crear una instancia de compras con los valores ingresados
        Tarea2S12 compras = new Tarea2S12(compra1, compra2, compra3, compra4);
        //Se muestra el resumen de las compras
        compras.mostrarResumenCompras();
        // Se cierra el scanner
        scanner.close();
    }
}


