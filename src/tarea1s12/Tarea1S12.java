package tarea1s12;
import java.util.Scanner;
public class Tarea1S12 {

    // Atributos
    private double ingMensual;
    private double otrosIngresos;
    private double gastosMes;
    // Modelo constructor
    public Tarea1S12(double ingresoMensual, double otrosIngresos, double gastosMensuales) {
        this.ingMensual = ingresoMensual;
        this.otrosIngresos = otrosIngresos;
        this.gastosMes = gastosMensuales;
    }
    // Metodo para calcular el ahorro mensual
    public double calcularAhorroMensual() {
        return (ingMensual + otrosIngresos) - gastosMes;
    }
    // Metodo para calcular el ahorro semestral
    public double calcularAhorroSemestral() {
        return calcularAhorroMensual() * 6;
    }
    // Metodo para calcular el ahorro anual
    public double calcularAhorroAnual() {
        return calcularAhorroMensual() * 12;
    }
    // Metodo para mostrar el resumen de ahorros
    public void mostrarResumenAhorros() {
        System.out.println("RESULTADOS: ");
        System.out.println("Ahorro mensual: " + calcularAhorroMensual());
        System.out.println("Ahorro semestral proyectado: " + calcularAhorroSemestral());
        System.out.println("Ahorro anual proyectado: " + calcularAhorroAnual());
    }
    // Metodo principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Usuario ingresa los datos
        System.out.print("Ingrese el ingreso mensual: ");
        double ingresoMensual = scanner.nextDouble();
        System.out.print("Ingrese otros ingresos: ");
        double otrosIngresos = scanner.nextDouble();
        System.out.print("Ingrese los gastos mensuales: ");
        double gastosMensuales = scanner.nextDouble();

        // Crea una instancia de Tarea1S12 con los datos ingresados
        Tarea1S12 empleado = new Tarea1S12(ingresoMensual, otrosIngresos, gastosMensuales);
        // Muestra resumen de ahorros
        empleado.mostrarResumenAhorros();
        // Se cierra el scanner
        scanner.close();
    }
}
    

