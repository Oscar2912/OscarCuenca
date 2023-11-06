import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String nombre;
        double precio;
        int cantidad;

        System.out.println("**** BIENVENIDO AL SISTEMA DE MANEJO DE INVENTARIOS ****");
        System.out.println("Introduzca el nombre del producto:");
        nombre = sc.nextLine();
        System.out.println("Introduzca el precio del producto: ");
        precio = sc.nextDouble();
        System.out.println("Introduzca la cantidad del producto: ");
        cantidad = sc.nextInt();

        try {
            Producto producto1 = new Producto(nombre, precio, cantidad);
            System.out.println(producto1.toString());
        }catch (ProductoException e){
            System.out.println("Se produjo la excepción: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Se produjo la excepción genérica: " + e.getMessage());
        }
    }
}