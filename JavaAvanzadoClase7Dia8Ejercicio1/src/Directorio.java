import java.util.*;

public class Directorio <T>{
    protected int id;
    protected String nombre;
    protected List<Directorio> subdirectorios;
    protected List<String> archivos;

    public Directorio(int id, String nombre, List<String> archivos) {
        this.id = id;
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = archivos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }
}