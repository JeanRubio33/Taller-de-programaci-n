package tarea4s9;
import java.util.Scanner;
public class Tarea4S9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5]; // Arreglo para 5 nombres
        regNombres(nombres, scanner); // Registran los nombres
        System.out.print("Ingrese el nombre a buscar: ");
        String nombreBuscado = scanner.next(); // Lee el nombre a buscar
        bNombre(nombres, nombreBuscado); // Realiza la busqueda del nombre
    }
    public static void regNombres(String[] nombres, Scanner scanner) {
        // Se registra los nombres
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = scanner.next(); // Se almacena cada nombre
        }
    }
    public static void bNombre(String[] nombres, String nombreBuscado) {
        // Metodo para buscar un nombre
        boolean encontrado = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.println("La persona existe en la posicion: " + (i + 1));
                encontrado = true;
                break; // Se detiene la busqueda si se encuentra el nombre
            }
        }
        if (!encontrado) {
            System.out.println("La persona no existe en la lista.");
        }
    }
}

