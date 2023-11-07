public class Main {
    public static void main(String[] args) {

        //Se inicializa el objeto atencionCliente para asignarlo posteriormente a los agentes y poder llamar a los métodos de la clase
        AtencionCliente atencionCliente = new AtencionCliente("");

        //Se crean los hilos correspondientes a los agentes
        Thread agente1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    atencionCliente.atenderLlamada("Paco", i);
                }
            }
        });
        Thread agente2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    atencionCliente.atenderLlamada("Luis", i);
                }
            }
        });
        Thread agente3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    atencionCliente.atenderLlamada("María", i);
                }
            }
        });

        //Se ejecutan los hilos
        agente1.start();
        agente2.start();
        agente3.start();

        //Se hace esperar al programa principal a que terminen sus tareas todos los hilos
        try{
            agente1.join();
            agente2.join();
            agente3.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}