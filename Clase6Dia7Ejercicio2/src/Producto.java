public class Producto {
    //Atributos
    private int código;
    private String nombre;
    private String marca;
    private String tipo;
    private double precioCosto;
    private double precioVenta;
    private int cantidadStock;

    //Constructores
    public Producto(int código, String nombre, String marca, String tipo, double precioCosto, double precioVenta, int cantidadStock) {
        this.código = código;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "**** Datos del producto ****\n" +
                "Código: " + código +
                "\nNombre: " + nombre +
                "\nMarca: " + marca +
                "\nTipo: " + tipo +
                "\nPrecio del costo: " + precioCosto +
                "\nPrecio de venta: " + precioVenta +
                "\nCantidad en Stock: " + cantidadStock + "\n";
    }
}
