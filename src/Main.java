import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nombreProducto = new String[10];
        double[] precioProducto = new double[10];

        System.out.println("Ingrese los datos del producto");
        System.out.println("Porfavor, ingrese el nombre del producto: ");

        nombreProducto[0] = sc.nextLine();
        System.out.println("Porfavor, ingrese el precio del producto: ");

        precioProducto[0] = sc.nextDouble();

        System.out.println("Se ha guardado el producto " + nombreProducto[0] + " con el precio de " + precioProducto[0]);
    }
}