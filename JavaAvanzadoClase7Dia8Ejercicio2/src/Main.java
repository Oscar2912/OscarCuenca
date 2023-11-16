import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Se crea el objeto principal, del que colgaran el resto de tareas
        Tareas proyecto = new Tareas("Proyecto: Desarrollo de Software");
        List<Tareas> listaTareas = Arrays.asList(
                new Tareas("|-- Tarea Principal: Diseño de la Aplicación"),
                new Tareas("|-- Tarea Principal: Implementación del Código"),
                new Tareas("|-- Tarea Principal: Pruebas y Depuración")
        );
        //Se cargan las tareas principales colgando del proyecto principal
        proyecto.setSubtareas(listaTareas);
        //Se almacenan las tareas cargadas en una lista para poder acceder a ellas y así cargar subtareas a estas
        List<Tareas> tareas = proyecto.getSubtareas();

        //Se cargan subtareas accediendo al elementos de la lista tareas que corresponda
        List<Tareas> subtareas0 = Arrays.asList(
                new Tareas("|-- Subtarea: Crear Prototipo"),
                new Tareas("|-- Subtarea: Diseñar Interfaz"),
                new Tareas("|-- Subtarea: Documentar Requisitos")
        );
        tareas.get(0).setSubtareas(subtareas0);

        List<Tareas> subtareas01 = Arrays.asList(
                new Tareas("|-- Sub-subtarea: Definir Esquema de Colores"),
                new Tareas("|-- Sub-subtarea: Diseñar Diseño Responsivo")
        );
        subtareas0.get(1).setSubtareas(subtareas01);

        List<Tareas> subtareas1 = Arrays.asList(
                new Tareas("|-- Subtarea: Desarrollar Backend"),
                new Tareas("|-- Subtarea: Desarrollar Frontend")
        );
        tareas.get(1).setSubtareas(subtareas1);

        List<Tareas> subtareas10 = Arrays.asList(
                new Tareas("|-- Sub-subtarea: Configurar Base de Datos"),
                new Tareas("|-- Sub-subtarea: Crear Lógica de Negocios")
        );
        subtareas1.get(0).setSubtareas(subtareas10);

        List<Tareas> subtareas11 = Arrays.asList(
                new Tareas("|-- Sub-subtarea: Codificar Interfaz de Usuario"),
                new Tareas("|-- Sub-subtarea: Integrar con Backend")
        );
        subtareas1.get(1).setSubtareas(subtareas11);

        List<Tareas> subtareas2 = Arrays.asList(
                new Tareas("|-- Subtarea: Ejecutar Pruebas de Integración"),
                new Tareas("|-- Subtarea: Solucionar Errores")
        );
        tareas.get(2).setSubtareas(subtareas2);

        //Se llama al método verTareas para mostrar el árbol de tareas creado
        proyecto.verTareas(proyecto, 0);
    }
}