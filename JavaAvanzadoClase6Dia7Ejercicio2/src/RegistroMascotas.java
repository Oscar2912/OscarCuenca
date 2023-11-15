import java.util.*;

public class RegistroMascotas <T extends Mascota>{
    //Se declara la lista en la que se almacenarán los objetos que se creen en el método al que se pasarán los datos introducidos en el Main
    private List<T> mascotas;
    public RegistroMascotas(){
        this.mascotas = new ArrayList<>();
    }

    //Método que permite añadir mascotas al listado y devuelve un mensaje confirmando que se ha añadido correctamente
    public void AgregarMascotas(T mascota){
        //Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular colecciones como ArrayList o LinkedList y agregar mascotas de distinto tipo al registro de la veterinaria (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).
        mascotas.add(mascota);
        System.out.println("Se ha añadido a " + mascota.getNombre() + " a la lista.");
    }

    //Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.
    //Método que almacena las mascotas que concidan con el nombre indicado al llamar al método, siendo filtradas todas las mascotas que se encuentren en la lista
    public List<T> BuscarNombreMascota(String nombre){
        System.out.println("Mascotas llamadas " + nombre);
        List<T> nombreMascotas = mascotas.stream()
                .filter(m -> m.getNombre().equalsIgnoreCase(nombre))
                .toList();
        return nombreMascotas;
    }

    //Método que almacena las mascotas que concidan con la especie indicada al llamar al método, siendo filtradas todas las mascotas que se encuentren en la lista
    public List<T> BuscarEspecieMascota(String especie){
        System.out.println("Mascotas de la especie " + especie);
        List<T> especieMascotas = mascotas.stream()
                .filter(m -> m.getEspecie().equalsIgnoreCase(especie))
                .toList();
        return especieMascotas;
    }

    //Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el tamaño de la colección y contar la cantidad total de mascotas registradas en la veterinaria.
    //Método que calcula, almacena y devuelve la cantidad total de las mascotas que están registradas
    public int CantidadMascotas(){
        int cantidadMascotas = (int) mascotas.stream().count();
        return cantidadMascotas;
    }
}
