public class Producto {
    //Atributos
    private String nombre;
    private double precio;
    private int cantidad;

    //Constructores
    public Producto(String nombre, double precio, int cantidad) throws ProductoException{
        //Se realiza un control que asegura que los datos introducidos por el usuario son correctos. De no cumplirse, se mostrará un mensaje descriptivo informando sobre el error detectado y no se creará el objeto
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
