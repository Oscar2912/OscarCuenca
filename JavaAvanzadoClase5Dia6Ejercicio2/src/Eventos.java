import java.time.LocalDate;

public class Eventos {
    //Atributos
    private String nombre;
    private LocalDate fecha;
    private String categoria;

    //Constructor
    public Eventos(String nombre, LocalDate fecha, String categoria) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    //Métodos
    public LocalDate getFecha() {
        return fecha;
    }

    public String getCategoria() {
        return categoria;
    }


    @Override
    public String toString() {
        return "Eventos{" +
                "nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
