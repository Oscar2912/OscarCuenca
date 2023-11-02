public class Main {
    public static void main(String[] args) {

        //Crear un vector (array) de tipo Verdura que pueda almacenar 5 verduras. Crear 5 verduras y guardarlas en el vector.
        Verdura[] verduras = new Verdura[5];

        verduras[0] = new Verdura(1, "Lechuga", "Verde", 10, "No");
        verduras[1] = new Verdura(2, "Acelgas", "Verde", 15, "Si");
        verduras[2] = new Verdura(3, "Guisantes", "Verde", 2, "No");
        verduras[3] = new Verdura(4, "Champiñones", "Marrón", 20, "Si");
        verduras[4] = new Verdura(5, "Cebolla", "Blanco", 15, "No");

        //Recorrer el vector creado y mostrar por pantalla el nombre y las calorías de las verduras almacenadas.
        for (int i = 0; i < verduras.length; i++){
            System.out.println("---- Información verdura " + (i+1) + " ----");
            System.out.println("Nombre: " + verduras[i].getNombre());
            System.out.println("Calorías: " + verduras[i].getCalorias());
        }

        //Cambiar todos los datos de dos verduras. Mostrar por pantalla los datos de todas las verduras luego del cambio.
        System.out.println("---- Realizando cambio de datos sobre 2 verduras ----");
        verduras[2].setId(6);
        verduras[2].setNombre("Remolacha");
        verduras[2].setColor("Morado");
        verduras[2].setCalorias(8);
        verduras[2].setDebeCocinarse("Si");

        System.out.println("...");

        verduras[4].setId(7);
        verduras[4].setNombre("Zanahoria");
        verduras[4].setColor("Naranja");
        verduras[4].setCalorias(12);
        verduras[4].setDebeCocinarse("No");

        System.out.println("---- Información de las verduras tras el cambio de datos ----");
        for (Verdura nuevasVerduras : verduras){
            System.out.println("Información Verdura " + nuevasVerduras.getId());
            System.out.println("Id: " + nuevasVerduras.getId());
            System.out.println("Nombre: " + nuevasVerduras.getNombre());
            System.out.println("Color: " + nuevasVerduras.getColor());
            System.out.println("Calorías: " + nuevasVerduras.getCalorias());
            System.out.println("¿Debe cocinarse?: " + nuevasVerduras.getDebeCocinarse());
        }

        //Recorrer el vector y mostrar por pantalla únicamente a las verduras que sean de color verde.
        System.out.println("---- Verduras de color verde ----");
        for (Verdura verdurasVerdes : verduras){
            if(verdurasVerdes.getColor().equals("Verde"))
                System.out.println(verdurasVerdes.getNombre());
        }

        //Prueba del funcionamiento de los métodos get

        System.out.println("\n***** PRUEBA GETTER ******");

        System.out.println("Id: " + verduras[0].getId() + " Nombre: " + verduras[0].getNombre() +
                            " Color: " + verduras[0].getColor() + " Calorias: " + verduras[0].getCalorias() +
                            " ¿Debe cocinarse? " + verduras[0].getDebeCocinarse());

        //Prueba del funcionamiento de los métodos set

        System.out.println("\n***** PRUEBA SETTER ******");

        verduras[0].setId(34);
        verduras[0].setNombre("Calabazin");
        verduras[0].setCalorias(45);
        verduras[0].setColor("Verde");
        verduras[0].setDebeCocinarse("Si");

        System.out.println("Id: " + verduras[0].getId() + " Nombre: " + verduras[0].getNombre() +
                " Color: " + verduras[0].getColor() + " Calorias: " + verduras[0].getCalorias() +
                " ¿Debe cocinarse? " + verduras[0].getDebeCocinarse());


    }
}