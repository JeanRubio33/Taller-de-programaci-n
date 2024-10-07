package tarea5s9;
import java.util.Scanner;
public class Tarea5S9 {
    public static void main(String[] args) {
        int[] a = new int[5]; // Arreglo A de 5 elementos
        int[] b = new int[5]; // Arreglo B de 5 elementos
        int[] c = new int[10]; // Arreglo C para almacenar los elementos intercalados

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los valores del arreglo A:");
        regArreglo(a, scanner); // Se ingresa los valores del arreglo A
        System.out.println("Ingrese los valores del arreglo B:");
        regArreglo(b, scanner); // Se ingresa los valores del arreglo B
        intArreglos(a, b, c); // Se intercalan los arreglos A y B en C
        System.out.println("Valores intercalados en el arreglo C:");
        mArreglo(c); // Se muestra el arreglo en C
    }
    public static void regArreglo(int[] arreglo, Scanner scanner) {
        // Método para registrar los valores de un arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt(); // Se almacena cada valor en el arreglo
        }
    }
    public static void intArreglos(int[] a, int[] b, int[] c) {
        // Método para intercalar los arreglos A y B en C
        int indice = 0; // Índice para el arreglo C
        // Se intercalan los valores de A y B en C
        for (int i = 0; i < a.length; i++) {
            c[indice++] = a[i]; // Se agrega el valor de A en la posicion correspondiente de C
            c[indice++] = b[i]; // Se agrega el valor de B en la posicion siguiente de C
        }
    }
    // Muestra los valores del arreglo
    public static void mArreglo(int[] arreglo) {
        for (int valor : arreglo) {
            System.out.print(valor + " "); // Muestra los valores del arreglo separados por espacio
        }
        System.out.println(); // Salto de lInea al finalizar la impresión
    }
}




