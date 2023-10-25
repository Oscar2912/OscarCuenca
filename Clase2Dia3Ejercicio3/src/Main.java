import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaramos el Scanner con idioma US para poder introducir los valores con "." en lugar de ","
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //Declaramos e inicializamos las variables
        double suma = 0;
        double media;

        //Declaramos el vector de números decimales en el que se van a almacenar las temperaturas
        double[] temperaturas = new double[7];

        //Se inicia un bucle con límite 7 para que el usuario introduzca las temperaturas máximas de los 7 días, y que dichos datos se almacenen en cada una de las posiciones del vector
        for (int i = 0; i < temperaturas.length; i++){
            System.out.println("Introduce la temperatura del día " + (i+1));
            //Se almacena el valor introducido en la posición del vector correcpondiente a la vuelta actual del bucle
            temperaturas[i] = sc.nextDouble();
        }

        //Se inicia un bucle en el que, mientras que haya información en la siguiente posición, se realizará la suma del valor que hay en la posición actual del vector con la almacenada en la variable suma
        for (int x = 0; x < temperaturas.length; x++){
            suma = suma + temperaturas[x];
        }

        //Se calcula la media de las temperaturas introducidas
        media = (double) suma / temperaturas.length;

        //Se muestra el resultado
        System.out.println("La media de las temperaturas máximas de la semana es " + media);
    }
}