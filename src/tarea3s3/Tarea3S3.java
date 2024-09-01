package tarea3s3;
import java.util.Scanner;
public class Tarea3S3 {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su consumo de electricidad en kWh: ");
        int consumo = scanner.nextInt();

        // Estructura condicional múltiple
        if (consumo < 100) {
            System.out.println("Categoria: Bajo consumo.");
        } else if (consumo >= 100 && consumo <= 200) {
            System.out.println("Categoria: Consumo moderado.");
        } else if (consumo > 200 && consumo <= 500) {
            System.out.println("Categoria: Consumo alto.");
        } else {
            System.out.println("Categoria: Consumo muy alto.");
        }
    }
}
    
    

