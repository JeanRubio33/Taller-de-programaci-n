package tarea3s4;

import java.util.Scanner;

public class Tarea3S4 {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número (1-6): ");
        int numero = scanner.nextInt();
        String ingles;

        switch (numero) {
            case 1:ingles = "one";break;
            case 2:ingles = "two";break;
            case 3:ingles = "three";break;
            case 4:ingles = "four";break;
            case 5:ingles = "five";break;
            case 6:ingles = "six";break;
            default:ingles = "Número fuera de rango";
        }

        System.out.println("Número = " + numero + ", Inglés = " + ingles);
    }
}

        
        
    
    

