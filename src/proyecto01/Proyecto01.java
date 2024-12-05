package proyecto01;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Proyecto01 {

    // Clase base para los elementos del almacen
    public static abstract class Item {
        private String nombre;
        private String categoria;
        private String stand;

        public Item(String nombre, String categoria, String stand) {
            this.nombre = nombre;
            this.categoria = categoria;
            this.stand = stand;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCategoria() {
            return categoria;
        }

        public String getStand() {
            return stand;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Categoria: " + categoria + ", Stand: " + stand;
        }
    }

    // Clase para equipos que hereda de Item
    public static class Equipo extends Item {
        private String tipoEquipo;
        private String macAddress;

        public Equipo(String nombre, String categoria, String stand, String tipoEquipo, String macAddress) {
            super(nombre, categoria, stand);
            this.tipoEquipo = tipoEquipo;
            this.macAddress = macAddress;
        }

        public String getMacAddress() {
            return macAddress;
        }

        @Override
        public String toString() {
            return super.toString() + ", Tipo de Equipo: " + tipoEquipo + ", MAC Address: " + macAddress;
        }
    }

    // Clase para materiales que hereda de Item
    public static class Material extends Item {
        private int cantidad;
        private String proveedor;

        public Material(String nombre, String categoria, String stand, int cantidad, String proveedor) {
            super(nombre, categoria, stand);
            this.cantidad = cantidad;
            this.proveedor = proveedor;
        }

        @Override
        public String toString() {
            return super.toString() + ", Cantidad: " + cantidad + ", Proveedor: " + proveedor;
        }
    }

    // Lista para almacenar todos los elementos
    private static List<Item> almacen = new ArrayList<>();

    // Metodo principal para interactuar con el usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Registrar Equipo");
            System.out.println("2. Registrar Material");
            System.out.println("3. Ver inventario");
            System.out.println("4. Buscar por codigo MAC");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarEquipo(scanner);
                    break;
                case 2:
                    registrarMaterial(scanner);
                    break;
                case 3:
                    verInventario();
                    break;
                case 4:
                    buscarPorMac(scanner);
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }

    // Metodo para registrar un equipo
    private static void registrarEquipo(Scanner scanner) {
        System.out.print("Ingrese el nombre del equipo: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la categoria: ");
        String categoria = scanner.next();
        System.out.print("Ingrese el stand: ");
        String stand = scanner.next();
        System.out.print("Ingrese el tipo de equipo: ");
        String tipoEquipo = scanner.next();
        System.out.print("Ingrese el codigo MAC: ");
        String macAddress = scanner.next();

        Equipo equipo = new Equipo(nombre, categoria, stand, tipoEquipo, macAddress);
        almacen.add(equipo);
        System.out.println("Equipo registrado exitosamente.");
    }

    // Metodo para registrar un material
    private static void registrarMaterial(Scanner scanner) {
        System.out.print("Ingrese el nombre del material: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la categoria: ");
        String categoria = scanner.next();
        System.out.print("Ingrese el stand: ");
        String stand = scanner.next();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        System.out.print("Ingrese el proveedor: ");
        String proveedor = scanner.next();

        Material material = new Material(nombre, categoria, stand, cantidad, proveedor);
        almacen.add(material);
        System.out.println("Material registrado exitosamente.");
    }

    // Metodo para ver todos los elementos del inventario
    private static void verInventario() {
        System.out.println("Inventario del almacen:");
        for (Item item : almacen) {
            System.out.println(item.toString());
        }
    }

    // Metodo para buscar un equipo por su codigo MAC
    private static void buscarPorMac(Scanner scanner) {
        System.out.print("Ingrese el codigo MAC a buscar: ");
        String macAddress = scanner.next();
        boolean encontrado = false;

        for (Item item : almacen) {
            if (item instanceof Equipo) {
                Equipo equipo = (Equipo) item;
                if (equipo.getMacAddress().equals(macAddress)) {
                    System.out.println("Equipo de Nombre: " + equipo.getNombre() + " y codigo MAC: " + macAddress + " se encuentra en Stand: " + equipo.getStand());
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro ningun equipo con el codigo MAC especificado.");
        }
    }
}


