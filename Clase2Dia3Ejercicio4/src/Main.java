import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Compañero: José del Palacio Casanova

        //Se declara Scanner
        Scanner sc = new Scanner(System.in);

        //Declaramos e inicializamos las variables
        boolean seguir = true;
        int fila, asiento, continuar;

        //Declaramos la matríz
        String[][] asientos = new String[5][5];

        //Recorremos la matríz sin realizar cambios en ella
        for(int x = 0; x < asientos.length; x++){
            for (int y = 0; y < asientos[0].length; y++){
                asientos [x][y] = " O ";
                System.out.print(asientos[x][y]);
            }
            System.out.println("");
        }

        //Iniciamos un bucle por centinela para que se repita el proceso de reserva de asientos hasta que el usuario indique que no quiere realizar más reservas
        while (seguir == true) {

            //Solicitamos al usuario que indique en qué fila quiere hacer la reserva
            System.out.println("Introduzca la fila del asiento que quiere reservar (entre 0 y 4)");
            fila = sc.nextInt();

            //Verificamos que el número introducido sea correcto
            while(fila < 0 || fila > 4){
                System.out.println("Introduzca un número de fila válido:");
                fila = sc.nextInt();
            }

            //Solicitamos al usuario que indique en qué asiento quiere hacer la reserva
            System.out.println("Introduzca el asiento que quiere reservar (entre 0 y 4)");
            asiento = sc.nextInt();

            //Verificamos que el número introducido sea correcto
            while(asiento < 0 || asiento > 4){
                System.out.println("Introduzca un número de asiento válido:");
                asiento = sc.nextInt();
            }

            //Se comprueba si el asiento seleccionado está disponible o ya fue reservado
            while (asientos[fila][asiento] == " X "){
                System.out.println("El asiento ya está reservado, selecciona uno distinto.");

                System.out.println("Introduzca la fila del asiento que quiere reservar (entre 0 y 4)");
                fila = sc.nextInt();

                while(fila < 0 || fila > 4){
                    System.out.println("Introduzca un número de fila válido:");
                    fila = sc.nextInt();
                }

                System.out.println("Introduzca el asiento que quiere reservar (entre 0 y 4)");
                asiento = sc.nextInt();

                while(asiento < 0 || asiento > 4){
                    System.out.println("Introduzca un número de asiento válido:");
                    asiento = sc.nextInt();
                }
            }

            //Se introduce en la posición de la matríz indicada el valor que muestra que se ha reservado esa posición
            asientos[fila][asiento] = " X ";
            for(int x = 0; x < asientos.length; x++){
                for (int y = 0; y < asientos[0].length; y++){
                    System.out.print(asientos[x][y]);
                }
                System.out.println("");
            }

            //Se solicita al usuario que indique si desea continuar
            System.out.println("¿Desea continuar?(1: Si)");
            continuar = sc.nextInt();

            //En caso de no querer continuar, se modifica el centinela para detener el programa
            if(continuar != 1){
                seguir = false;
            }
        }
    }
}