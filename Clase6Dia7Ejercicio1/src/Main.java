import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos, camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto(1, "4269LFT", "Cupra", "León", 2018, 22999.99, 12.8, 48.5));
        vehiculos.add(new Camioneta(2, "5634CHG", "Nissan", "Navara", 2004, 5999.99, 65, 12.8));
        vehiculos.add(new Moto(3, "5398GRS", "Honda", "CBR600RR", 2010, 5999.99, 599, "4 en línea"));

        for(Vehiculo info : vehiculos){
            System.out.println(info.toString());
            info.antiguedad();
            if(info.cargarEnergia() != null)
                System.out.println(info.cargarEnergia());
            else
                System.out.println(info.recargarCombustible());
            System.out.println();
        }
        //Implementar en Vehiculo las 2 interfaces y despues la interfaz correspondiente en cada clase hija y probar a llamar los métodos desde aquí
    }
}