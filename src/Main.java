import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        String[] nombreProducto = new String[10];
        double[] precioProducto = new double[10];

        System.out.println("\n--- MENÚ DE OPCIONES ---");
        System.out.println("1. Alta producto y precio");
        System.out.println("2. Listado de todos los productos con su precio");
        System.out.println("3. Precio medio del producto");
        System.out.println("4. Consulta por nombre de producto");
        System.out.println("5. Consulta por precio de producto");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");

        opcion = sc.nextInt();
        sc.nextLine();

        do{
            switch(opcion){
                case 1:
                    System.out.println("Porfavor, ingrese el nombre del producto: ");

                    nombreProducto[0] = sc.nextLine();
                    System.out.println("Porfavor, ingrese el precio del producto: ");

                    precioProducto[0] = sc.nextDouble();

                    System.out.println("Se ha guardado el producto " + nombreProducto[0] + " con el precio de " + precioProducto[0]);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 6);
    }
}