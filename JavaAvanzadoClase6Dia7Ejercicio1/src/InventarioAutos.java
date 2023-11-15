import java.util.ArrayList;
import java.util.List;

public class InventarioAutos <T extends Auto>{
    //Se declara la lista en la que se almacenarán los objetos que se creen en el método al que se pasarán los datos introducidos en el Main
    private List<T> autos;
    public InventarioAutos(){
        this.autos = new ArrayList<>();
    }

    //Método que permite añadir autos al listado y devuelve un mensaje confirmando que se ha añadido correctamente
    public void AgregarAutos(T auto){
        autos.add(auto);
        System.out.println("Se ha añadido al catálogo el vehículo: " + auto.getMarca() + " " + auto.getModelo());
    }

    //Método que almacena los autos que concidan con la marca indicada al llamar al método, siendo filtrados todos los autos que se encuentren en la lista
    public List<T> BuscarMarcaAutos(String marca){
            System.out.println("Catálogo de la marca " + marca);
            List<T> listaMarca = autos.stream()
                    .filter(a -> a.getMarca().equalsIgnoreCase(marca))
                    .toList();
            return listaMarca;
    }

    //Método que almacena los autos que concidan con el año indicado al llamar al método, siendo filtrados todos los autos que se encuentren en la lista
    public List<T> BuscarAnioAutos(int anio){
        System.out.println("Catálogo del año " +anio);
        List<T> listaAnio = autos.stream()
                .filter(a -> a.getAnio() == anio)
                .toList();
        return listaAnio;
    }

    //Método que calcula, almacena y muestra el valor total de los autos que se encuentran en la lista
    public void ValorTotal(){
        System.out.println("**** Valor total del catálogo ****");
        double valor = autos.stream()
                .mapToDouble(a -> a.getPrecio())
                .sum();
        System.out.println(String.format("%.2f", valor));
    }
}
