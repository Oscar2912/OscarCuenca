public class Vestimenta {
    //Atributos
    private int codigo;
    private String nombre;
    private double precio;
    private String marca;
    private String talla;
    private String color;

    //Constructores
    public Vestimenta(int codigo, String nombre, double precio, String marca, String talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public void mostrar(){
    }

    //Métodos
    public String getMarca() {
        return marca;
    }
}
