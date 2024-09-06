package tarea2s4;
import java.util.Scanner;
public class Tarea2S4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número (1-10): ");
        int numero = scanner.nextInt();
        String romano;

        switch (numero) {
            case 1:romano = "I";break;
            case 2:romano = "II";break;
            case 3:romano = "III";break;
            case 4:romano = "IV";break;
            case 5:romano = "V";break;
            case 6:romano = "VI";break;
            case 7:romano = "VII";break;
            case 8:romano = "VIII";break;
            case 9:romano = "IX";break;
            case 10:romano = "X";break;
            default:romano = "Número fuera de rango";
        }

        System.out.println("Número = " + numero + ", Romano = " + romano);
    }
}

    
    

