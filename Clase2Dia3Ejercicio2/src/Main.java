import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Se declara Scanner
        Scanner sc = new Scanner(System.in);

        //Se declaran las variables y se inicializan
        boolean centinela = true;
        double producto = 0;
        double suma = 0;
        double total = 0;

        //Se inicia un bucle mediante centinela para que se detenga cuando lo indique el usuario
        while(centinela){
            //Se solicita al usuario que introduzca los datos soliictados
            System.out.println("Introduzca el precio del producto: ");
            producto = sc.nextDouble();
            //Se realiza la suma del valor introducido por el usuario y la cantidad introducida en ocasiones anteriores
            suma = total + producto;
            //Se asigna el resultado de la suma al valor total de esta vuelta al bucle
            total = suma;
            //Verificamos si el usuario quiere detener el programa o si desea introducir más datos
            if (producto <= 0){
                System.out.println("El precio total de la compra es: " + total);
                centinela = false;
            }
        }
    }
}