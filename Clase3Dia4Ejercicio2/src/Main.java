import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int id = 0;
        int indice = 0;
        String nombreAnterior = "";
        String nombreNuevo = "";

        //a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        //Se crea el vector de 5 posiciones solicitado
        Persona[] persona = new Persona[5];

        //Se crean las 5 personas y se insertan los datos relacionados con cada una de ellas
        persona[0] = new Persona(001, "Juan", 18, "Calle Falsa, 123", "+34659485321");
        persona[1] = new Persona(002, "Sara", 22, "Calle Imaginaria, 345", "+34622856348");
        persona[2] = new Persona(003, "Mario", 20, "Calle Lucida, 12", "+34628653158");
        persona[3] = new Persona(004, "Raúl", 23, "Avenida de Aragón, 34", "+34634856798");
        persona[4] = new Persona(005, "Pilar", 48, "Calle Imaginaria, 345", "+34642365896");

        //b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
        //Se recorre el vector con un bucle y se muestran los datos solicitados
        for (int i = 0; i < persona.length; i++){
            System.out.println("Datos de la " + (i+1) + "a persona");
            System.out.println(persona[i].getNombre());
            System.out.println(persona[i].getEdad());
        }

        //c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
        //Se inicia un bucle de 2 vueltas para modificar el nombre de las 2 personas como se indica
        for (int i = 0; i < 2; i++){
            //Se solicita al usuario que introduzca el ID de la persona a la que se le quiera cambiar el nombre
            System.out.println("Introduce el ID de la persona que quieres cambiar el nombre:");
            id = sc.nextInt();
            //Se introduce el nuevo nombre que se le quiere asignar a dicha persona
            System.out.println("Introduce el nombre que deseas asignarle:");
            nombreNuevo = sc.next();
            //Se recorre el vector persona para buscar la información introducida por el usuario
            for (int x = 0; x < persona.length; x++){
                //Se indica que, si coincide el ID introducido por el usuario con el ya existente en una de las personas declaradas, se guarde el nombre anterior y se cambie por el nuevo
                if(persona[x].getId() == id){
                    nombreAnterior = persona[x].getNombre();
                    persona[x].setNombre(nombreNuevo);
                }
            }
            //Se muestran los datos almacenados
            System.out.println("El nombre anterior de la persona indicada era " + nombreAnterior);
            System.out.println("El nuevo nombre de esta persona es " + nombreNuevo);
        }

        //d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
        System.out.println("Datos de las personas mayores de 30");
        for (int i = 0; i < persona.length; i++){
            if(persona[i].getEdad() > 30){
                System.out.println(persona[i].getId());
                System.out.println(persona[i].getNombre());
                System.out.println(persona[i].getEdad());
                System.out.println(persona[i].getDireccion());
                System.out.println(persona[i].getTelefono());
            }
        }
    }
}
