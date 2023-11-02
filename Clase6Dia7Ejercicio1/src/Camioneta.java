// Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
public class Camioneta extends Vehiculo implements Electrico, Combustion{
    //Atributos
    private double capacidadTanque;
    private double consumoCombustible;

    //Constructor
    public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    //Métodos
    @Override
    public void antiguedad() {
        System.out.println("La antigüedad del vehículo es: " +  + (2023 - anio));
    }

    @Override
    public String cargarEnergia() {
        return null;
    }

    @Override
    public String recargarCombustible() {
        return "Se está llenando el depósito...";
    }

    @Override
    public String toString() {
        return "**** INFORMACIÓN DE LA CAMIONETA ****\n" +
                "Id: " + id + "\n" +
                "Matrícula: " + placa + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Año de producción: " + anio + "\n" +
                "Precio: " + costo + "\n" +
                "Capacidad del depósito: " + capacidadTanque + "\n" +
                "Consumo de combustible: " + consumoCombustible;
    }
}
