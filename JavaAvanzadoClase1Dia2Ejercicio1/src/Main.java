import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String nombre;
        String destino;
        String fecha;
        int asientos;

        System.out.println("**** BIENVENIDO AL SISTEMA DE RESERVA DE VUELOS ****");
        System.out.println("Introduzca su nombre:");
        nombre = sc.nextLine();
        System.out.println("Introduzca el destino: ");
        destino = sc.nextLine();
        System.out.println("Indique la fecha del viaje: ");
        fecha = sc.nextLine();
        System.out.println("Introduzca la cantidad de asientos que desea reservar: ");
        asientos = sc.nextInt();

        try{
            Reserva reserva1 = new Reserva(nombre, destino, LocalDate.parse(fecha, formatter), asientos);
            System.out.println(reserva1.toString());
        }catch (ReservaInvalidaException e){
            System.out.println("Se produjo la excepción: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Se produjo la excepción genérica: " + e.getMessage());
        }
    }
}