import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Se declara el Scanner para que el usuario pueda introducir datos a la aplicación
        Scanner sc = new Scanner(System.in);
        //Se declara el vector en el que se almacenarán 5 datos introducidos por el usuario
        String [] datos = new String[5];
        //Se declara la variable en la que se almacenará la posición del vector que indique el usuario a la que quiere acceder
        int indice;

        //Se solicita al usuario que introduzca los datos que desee en todas las posiciones del vector
        for(int i = 0; i < datos.length; i++){
            System.out.println("Introduce un dato: ");
            datos[i] = sc.nextLine();
        }

        //Se solicita al usuario que indique a qué posición del vector desea acceder
        System.out.println("Introduce el índice del dato que quieres mostrar:");
        indice = sc.nextInt();
        //Se muestra la información que se encuentre en la posición indicada por el usuario
        try{
            System.out.println(datos[indice]);
        //En caso de no existir la posición indicada, se muestra un error descriptivo
        }catch (Exception e){
            System.out.println("Error: Estás tratando de acceder a una posición del vector que no es válida.");
        }
    }
}