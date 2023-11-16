import java.util.*;
public class Tareas {
    //Atributos
    private String nombre;
    private List<Tareas> subtareas;

    //Constructor
    public Tareas(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public List<Tareas> getSubtareas() {
        return subtareas;
    }

    public void setSubtareas(List<Tareas> subtareas) {
        this.subtareas = subtareas;
    }

    //Método recursivo que muestra el nombre de la tarea desde la que se accede, y si tiene subtareas, vuelve a acceder para mostrarlas
    public void verTareas(Tareas tarea, int nivel){
        for (int i = 1; i < nivel; i++) {
            System.out.print("|\t");
        }
        System.out.println(tarea.getNombre());
        if(tarea.getSubtareas() != null)
            for(Tareas subtareas : tarea.getSubtareas()){
                verTareas(subtareas, nivel + 1);
            }
    }
}
