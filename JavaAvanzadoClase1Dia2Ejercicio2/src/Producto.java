public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidad) throws ProductoException{
        if(nombre.isEmpty() || nombre == ""){
            throw new ProductoException("Debe introducir el nombre del producto");
        }else if(precio <= 0){
            throw new ProductoException("Debe introducir un precio mayor de 0");
        }else if(cantidad < 1){
            throw new ProductoException("Debe introducir una cantidad mayor de 1");
        }else {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
