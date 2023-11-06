import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] datos = new String[5];
        int indice;

        for(int i = 0; i < datos.length; i++){
            System.out.println("Introduce un dato: ");
            datos[i] = sc.nextLine();
        }

        System.out.println("Introduce el índice del dato que quieres mostrar:");
        indice = sc.nextInt();
        try{
            System.out.println(datos[indice]);
        }catch (Exception e){
            System.out.println("Error: Estás tratando de acceder a una posición del vector que no es válida.");
        }
    }
}