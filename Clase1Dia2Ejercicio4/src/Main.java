import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Si se introduce 0 como segundo número, al declarar el resultado de la división como double, se considera que el resultado es infinito
        //Sol Lereah
        //Jose del Palacio Casanova

        //Se declara el Scanner
        Scanner sc = new Scanner(System.in);

        //Se declaran las variables
        int numero1, numero2, suma, resta, multiplicacion;
        double division;

        //Se solicita al usuario que introduzca el primer número
        System.out.println("Introduce el primer número: ");

        //Se almacena el valor introducido en su variable correspondiente
        numero1 = sc.nextInt();

        //Se solicita al usuario que introduzca el segundo número
        System.out.println("Introduce el segundo número, siendo distinto de \"0\": ");

        //Se almacena el valor introducido en su variable correspondiente
        numero2= sc.nextInt();

        //Se realizan las operaciones correspondientes y se almacenan los resultados en cada una de sus variables
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;

        //Se especifica que el resultado de la división debe ser un número decimal, ya que, de no ser así, si se introduce en numero2 un 0 por error, devolvería un error el programa. De esta forma devuelve que el resultado es infinito
        division = (double) numero1 / numero2;

        //Se muestran los resultados de las operaciones realizadas
        System.out.println("La suma de los dos números es: " + suma);
        System.out.println("La resta de los dos números es: " + resta);
        System.out.println("La multiplicación de los dos números es: " + multiplicacion);
        System.out.println("La división de los dos números es: " + division);
    }
}