package tarea2s8;
import java.util.Scanner;
public class Tarea2S8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad que ahorras cada mes: ");
        double ahorroMes = sc.nextDouble();
        System.out.print("Ingresa la tasa de interes mensual (en porcentaje): ");
        double tasaInteres = sc.nextDouble();
        System.out.print("Ingresa el numero de meses: ");
        int meses = sc.nextInt();// Ingresar la cantidad mensual de ahorro y cantidad meses

        tasaInteres /= 100;// Convertir la tasa de interés en decimal 
        double totalAcumulado = 0;// Variable para almacenar el total acumulado

        for (int i = 1; i <= meses; i++) {
            totalAcumulado += ahorroMes; // Suma del ahorro mensual
            totalAcumulado += totalAcumulado * tasaInteres; // Se aplica el interes sobre el saldo
            System.out.println("Mes " + i + ": " + totalAcumulado);
        }// Bucle para calcular el ahorro acumulado total

        System.out.println("El acumulado total despues de " + meses + " meses es: " + totalAcumulado);
        // Resultado del total despues de los meses
    }
}


