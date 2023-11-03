import java.util.Calendar;

import static java.util.Calendar.*;

//Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.
public class Auto extends Vehiculo implements Electrico{
    //Atributos
    private double capacidadBateria;
    private double autonomia;

    //Constructor
    public Auto(int id, String placa, String marca, String modelo, int anio, double costo, double capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    //Métodos
    @Override
    public void antiguedad() {
        System.out.println("La antigüedad del vehículo es: " + (getInstance().get(YEAR) - anio));
    }

    @Override
    public String cargarEnergia() {
        return "Se está cargando la batería...";
    }

    @Override
    public String toString() {
        return "**** INFORMACIÓN DEL COCHE ****\n" +
                "Id: " + id + "\n" +
                "Matrícula: " + placa + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Año de producción: " + anio + "\n" +
                "Precio: " + costo + "\n" +
                "Capacidad de la batería: " + capacidadBateria + "\n" +
                "Autonomía: " + autonomia;
    }
}
