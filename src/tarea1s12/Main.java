package tarea1s12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el ingreso mensual
        System.out.print("Ingrese el ingreso mensual: ");
        double ingresoMensual = scanner.nextDouble();

        // Pedir al usuario que ingrese otros ingresos
        System.out.print("Ingrese otros ingresos: ");
        double otrosIngresos = scanner.nextDouble();

        // Pedir al usuario que ingrese los gastos mensuales
        System.out.print("Ingrese los gastos mensuales: ");
        double gastosMensuales = scanner.nextDouble();

        // Crear un objeto de Tarea1S12 con los valores ingresados
        Tarea1S12 empleado = new Tarea1S12(ingresoMensual, otrosIngresos, gastosMensuales);

        // Mostrar el resumen de ahorros
        empleado.mostrarResumenAhorros();

        // Cerrar el scanner
        scanner.close();
    }
}

    

