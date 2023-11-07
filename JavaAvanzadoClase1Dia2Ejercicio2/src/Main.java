import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Se declara el Scanner con formato US para que el usuario pueda introducir datos a la aplicación y que este reconozca los decimales numéricos con separación por "." en lugar de ","
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //Se declaran las variables necesarias para crear el objeto Producto posteriormente
        String nombre;
        double precio;
        int cantidad;

        //Se solicitan los datos necesarios al usuario
        System.out.println("**** BIENVENIDO AL SISTEMA DE MANEJO DE INVENTARIOS ****");
        System.out.println("Introduzca el nombre del producto:");
        nombre = sc.nextLine();
        System.out.println("Introduzca el precio del producto: ");
        precio = sc.nextDouble();
        System.out.println("Introduzca la cantidad del producto: ");
        cantidad = sc.nextInt();

        //Se trata de crear el objeto Producto con los datos introducidos, y si se crea correctamente, se muestran los datos del objeto
        try {
            Producto producto1 = new Producto(nombre, precio, cantidad);
            System.out.println(producto1.toString());
        //Se captura una excepción personalizada si se cumple alguna de las condiciones declaradas en la clase Producto
        }catch (ProductoException e){
            System.out.println("Se produjo la excepción: " + e.getMessage());
        //Se captura una excepción genérica si se cumple alguna de las condiciones genéricas declaradas en Exception
        }catch (Exception e){
            System.out.println("Se produjo la excepción genérica: " + e.getMessage());
        }
    }
}