import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Se inicializa el método genérico Random
        Random random = new Random();

        //Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos aleatorios, como nombres, edades o especies, para agregar mascotas al registro.
        //Se crean los objetos Mascota y se añaden a la lista
        RegistroMascotas<Mascota> mascotas = new RegistroMascotas<>();

        //Utilizando random, se añaden datos aleatorios en el registro de las mascotas
        mascotas.AgregarMascotas(new Mascota(1, GeneradorNombres((int) (Math.random() * 10) + 1), 13, "Perro"));
        mascotas.AgregarMascotas(new Mascota(2, "Tobby", random.nextInt(100), "Perro"));
        mascotas.AgregarMascotas(new Mascota(3, "Pepe", 8, GeneradorNombres((int) (Math.random() * 10) + 1)));
        mascotas.AgregarMascotas(new Mascota(4, "Pepe", random.nextInt(100), "Canario"));
        mascotas.AgregarMascotas(new Mascota(5, GeneradorNombres((int) (Math.random() * 10) + 1), 2, "Gato"));

        //Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.
        //Se llama al método que filtrará a las mascotas registradas por el nombre indicado al llamar al método, y la lista resultante se almacenará en mascotasPorNombre para mostrar todas las mascotas que coincidan con el nombre
        System.out.println("**** LISTADO POR NOMBRE ****");
        List<Mascota> mascotasPorNombre = mascotas.BuscarNombreMascota("Pepe");
        mascotasPorNombre.forEach(System.out::println);

        //Se llama al método que filtrará a las mascotas registradas por la especie indicada al llamar al método, y la lista resultante se almacenará en mascotasPorEspecie para mostrar todas las mascotas que coincidan con la especie
        System.out.println("**** LISTADO POR ESPECIE ****");
        List<Mascota> mascotasPorEspecie = mascotas.BuscarEspecieMascota("Perro");
        mascotasPorEspecie.forEach(System.out::println);


        //Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el tamaño de la colección y contar la cantidad total de mascotas registradas en la veterinaria.
        //Se llama al método que calcula el valor total de las mascotas que están registradas
        System.out.println("**** CANTIDAD TOTAL DE MASCOTAS REGISTRADAS ****");
        int cantidadMascotas = mascotas.CantidadMascotas();
        System.out.println("Actualmente se han registrado " + cantidadMascotas + " en la clínica.");

    }

    //Función que genera nombres rándom de menos de 10 letras
    static String GeneradorNombres(int longitud){
        String letras = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder nombre = new StringBuilder(longitud);
        for(int i = 0; i < longitud; i++){
            int letra = (int) (letras.length() * Math.random());
            nombre.append(letras.charAt(letra));
        }
        return nombre.toString();
    }
}