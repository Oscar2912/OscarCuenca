public class Mascota<T>{
    //Atributos
    private int id;
    private String nombre;
    private int edad;
    private String especie;

    //Contructor
    public Mascota(int id, String nombre, int edad, String especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                '}';
    }
}
