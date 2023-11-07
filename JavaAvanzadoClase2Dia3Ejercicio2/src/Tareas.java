public class Tareas extends Thread{
    //Atributos
    private double tarea;
    private String nombre;

    //Constructor
    public Tareas(String nombre) {
        this.nombre = nombre;
    }

    //Se crean los métodos de las diferentes actividades con el atributo synchronized para controlar la concurrencia.
    public synchronized void ensamblar(String nombre){
        System.out.println("El trabajador " + nombre + " está ensamblando productos.");
    }

    public synchronized void controlesCalidad(String nombre){
        System.out.println("El trabajador " + nombre + " está realizando controles de calidad.");
    }

    public synchronized void embalar(String nombre){
        System.out.println("El trabajador " + nombre + " está embalando productos.");
    }

    //Se indica que cada hilo deberá realizar 4 tareas, y dependiendo del número aleatorio que salga en cada una de ellas, se ejecutará uno de los métodos indicados anteriormente
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            tarea = Math.random();
            if (tarea < 0.33){
                ensamblar(nombre);
            }else if(tarea >= 0.33 && tarea < 0.66){
                controlesCalidad(nombre);
            }else{
                embalar(nombre);
            }
        }
    }
}
