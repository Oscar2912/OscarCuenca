public class Animal {
    //Atributos
    private int id;
    private String nombre;
    private int edad;
    private String tipoPiel;
    private String tipoAlimentacion;

    //Métodos
    public Animal(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void saludar(){
        System.out.println("Hola, soy un animal.");
    }

    //Constructores
    public String getNombre() {
        return nombre;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }
}
