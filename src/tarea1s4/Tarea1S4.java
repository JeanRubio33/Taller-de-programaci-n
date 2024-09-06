package tarea1s4;

import java.util.Scanner;

public class Tarea1S4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número (1-5): ");
        int numero = scanner.nextInt();
        String palabra;

        switch (numero) {
            case 1:palabra = "uno";break;
            case 2:palabra = "dos";break;
            case 3:palabra = "tres";break;
            case 4:palabra = "cuatro";break;
            case 5:palabra = "cinco";break;
            default:palabra = "Número fuera de rango";
        }

        System.out.println("Número = " + numero + ", Palabra = " + palabra);
    }
}
  
    

