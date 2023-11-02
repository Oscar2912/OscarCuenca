// Crear una clase abstracta llamada Vehiculo con los siguientes atributos: id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.
public abstract class Vehiculo{
    //Atributos
    protected int id;
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double costo;

    //Cosntructores

    public Vehiculo(int id, String placa, String marca, String modelo, int anio, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }

    //Métodos
    public abstract void antiguedad();
}
