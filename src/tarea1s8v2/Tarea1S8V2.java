package tarea2s8v2;
import java.util.Scanner;
public class Tarea1S8V2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la tasa de interes mensual (porcentaje): ");
        double TInteres = sc.nextDouble(); // Se ingresa la tasa de interes mensual
        TInteres /= 100;// Convertir la tasa de interes en decimal
        double saldo = 0;// Variable para almacenar el saldo acumulado
        System.out.print("Ingresa el numero de meses: ");
        int meses = sc.nextInt();//Se ingresa el numero de meses

        for (int i = 1; i <= meses; i++) {
            System.out.print("Ingresa el deposito para el mes " + i + ": ");
            double dep = sc.nextDouble();// Bucle para ingresar los depositos y calcular el saldo que acumula
            
            saldo += dep; // Se añade el deposito al saldo
            saldo += saldo * TInteres; // Se añade el interes mensual al saldo
            
            System.out.println("Saldo despues del mes " + i + ": " + saldo);
        }

        System.out.println("El saldo final despues de " + meses + " meses es: " + saldo);
        // Imprimir el saldo final después de todos los meses
    }
}

