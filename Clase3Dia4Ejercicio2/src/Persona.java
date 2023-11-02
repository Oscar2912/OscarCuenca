public class Persona {
    //Se declaran los atributos o propiedades de la clase persona
    private int id;
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;

    //Se declara el constructor sin parámetros
    public Persona() {

    }

    //Se declara el constructor con los parámetros indicados
    public Persona(int valorId, String valorNombre, int valorEdad, String valorDireccion, String valorTelefono) {
        id = valorId;
        nombre = valorNombre;
        edad = valorEdad;
        direccion = valorDireccion;
        telefono = valorTelefono;
    }

    //Se generan los getter y los setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
