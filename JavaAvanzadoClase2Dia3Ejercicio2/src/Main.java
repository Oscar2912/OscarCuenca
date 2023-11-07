public class Main {
    public static void main(String[] args) {
        //Se crean los hilos correspondientes a los trabajadores
        Thread trabajador1 = new Thread(new Tareas("Manolo"));
        Thread trabajador2 = new Thread(new Tareas("Luis"));
        Thread trabajador3 = new Thread(new Tareas("Pedro"));

        //Se ejecutan los hilos
        trabajador1.start();
        trabajador2.start();
        trabajador3.start();

        //Se hace esperar al programa principal a que terminen sus tareas todos los hilos
        try{
            trabajador1.join();
            trabajador2.join();
            trabajador3.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}