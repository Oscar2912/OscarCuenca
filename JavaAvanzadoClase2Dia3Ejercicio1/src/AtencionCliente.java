public class AtencionCliente extends Thread{
    private String nombre;

    //Constructor
    public AtencionCliente(String nombre) {
        this.nombre = nombre;
    }

    //Se crea el método que indicará las acciones que realiza cada agente al atender una llamada con el atributo synchronized para controlar la concurrencia y evitar conflictos.
    public synchronized void atenderLlamada(String nombre, int llamada){
        System.out.println("El agente " + nombre + " atiende la llamada " + llamada);
        System.out.println("El agente " + nombre + " resuelve las consultas de la llamada " + llamada);
        System.out.println("El agente " + nombre + " registra la enformación de la llamada " + llamada);
    }
}
