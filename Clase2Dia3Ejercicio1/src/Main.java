import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        //Se declara el Scanner
        Scanner sc = new Scanner(System.in);

        /*String fechaHoy = String.valueOf(Date.from(Instant.now()));
        System.out.println(fechaHoy);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date hoy = formato.parse(fechaHoy);
        Date fechaUsuario;
        int intFechaUsuario;
        System.out.println("Introduzca su fecha de nacimiento: ");
        intFechaUsuario = sc.nextInt();
        fechaUsuario = formato.parse(String.valueOf(intFechaUsuario));
        int edad = fechaUsuario - fechaHoy;
        System.out.println(fechaHoy);*/

        //Se declara la variable
        int edad;

        //Se solicita al usuario que indique su edad para almacenarla en la variable
        System.out.println("Introduce tu edad:");
        edad = sc.nextInt();

        //Se comprueba si la edad introducida es mayor de 18 para mostrar un mensaje u otro
        if(edad < 18){
            System.out.println("No puedes acceder. Es necesario que seas mayor de 18 años.");
        }else{
            System.out.println("Acceso permitido.");
        }
    }
}