import static java.util.Calendar.YEAR;
import static java.util.Calendar.getInstance;

//Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
public class Moto extends Vehiculo implements Combustion{
    //Atributos
    private int cilindrada;
    private String tipoMotor;

    //Constructor
    public Moto(int id, String placa, String marca, String modelo, int anio, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    //Métodos
    @Override
    public void antiguedad() {
        System.out.println("La antigüedad del vehículo es: " +  + (getInstance().get(YEAR) - anio));
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
                "Cilindrada: " + cilindrada + "\n" +
                "Tipo de motor: " + tipoMotor;
    }
}
