import java.util.*;

public class Main {
    public static void main(String[] args) {
        InventarioAutos<Auto> auto = new InventarioAutos<>();

        //Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la concesionaria.
        //Se crean los objetos auto y se añaden a la lista
        auto.AgregarAutos(new Auto("Audi", "RS3", 2020, 64999.99));
        auto.AgregarAutos(new Auto("Volkswagen", "Golf GTI", 2009, 15499.99));
        auto.AgregarAutos(new Auto("Mitsubishi", "Lancer EVO IX", 2009, 54999.99));
        auto.AgregarAutos(new Auto("Nissan", "Silvia S15", 2006, 49999.99));
        auto.AgregarAutos(new Auto("Nissan", "GT-R R35", 2019, 119999.99));

        //Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año dentro del inventario.
        //Se llama al método que filtrará a los autos registrados por la marca indicada al llamar al método, y la lista resultante se almacenará en listaMarca para mostrar todos los autos que coincidan con la marca
        System.out.println("**** LISTADO POR MARCA ****");
        List<Auto> listaMarca = auto.BuscarMarcaAutos("Nissan");
        listaMarca.forEach(System.out::println);

        //Se llama al método que filtrará a los autos registrados por el año indicado al llamar al método, y la lista resultante se almacenará en listaAnio para mostrar todos los autos que coincidan con el año
        System.out.println("**** LISTADO POR AÑO ****");
        List<Auto> listaAnio = auto.BuscarAnioAutos(2009);
        listaAnio.forEach(System.out::println);

        //Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de todos los autos en el inventario.
        //Se llama al método que calcula y muestra el valor total de los autos que se encuentran en el inventario
        System.out.println("**** VALOR TOTAL DEL CATÁLOGO ****");
        auto.ValorTotal();

    }
}