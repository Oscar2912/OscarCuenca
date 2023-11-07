import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Se declara el Scanner para que el usuario pueda introducir datos a la aplicación
        Scanner sc = new Scanner(System.in);
        //Se declara el formato en el que se parsearán las fechas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //Se declaran las variables necesarias para crear el objeto Reserva posteriormente
        String nombre;
        String destino;
        String fecha;
        int asientos;

        //Se solicitan los datos necesarios al usuario
        System.out.println("**** BIENVENIDO AL SISTEMA DE RESERVA DE VUELOS ****");
        System.out.println("Introduzca su nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduzca el destino: ");
        destino = sc.nextLine();
        System.out.println("Indique la fecha del viaje: ");
        fecha = sc.nextLine();
        System.out.println("Introduzca la cantidad de asientos que desea reservar: ");
        asientos = sc.nextInt();

        //Se trata de crear el objeto Reserva con los datos introducidos, y si se crea correctamente, se muestran los datos del objeto
        try{
            Reserva reserva1 = new Reserva(nombre, destino, LocalDate.parse(fecha, formatter), asientos);
            System.out.println(reserva1.toString());
        //Se captura una excepción personalizada si se cumple alguna de las condiciones declaradas en la clase Reserva
        }catch (ReservaInvalidaException e){
            System.out.println("Se produjo la excepción: " + e.getMessage());
        //Se captura una excepción genérica si se cumple alguna de las condiciones genéricas declaradas en Exception
        }catch (Exception e){
            System.out.println("Se produjo la excepción genérica: " + e.getMessage());
        }
    }
}