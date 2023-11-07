import java.time.LocalDate;

public class Reserva {
    //Atributos
    private String nombre;
    private String destino;
    private LocalDate fecha;
    private int numeroAsientos;
    private int asientosTotales = 2000;

    //Constructores
    public Reserva(String nombre, String destino, LocalDate fecha, int numeroAsientos) throws ReservaInvalidaException{
        //Se realiza un control que asegura que los datos introducidos por el usuario son correctos. De no cumplirse, se mostrará un mensaje descriptivo informando sobre el error detectado y no se creará el objeto
        if (nombre.isEmpty() || nombre == ""){
            throw new ReservaInvalidaException("Debe introducir su nombre");
        }else if(destino.isEmpty() || destino == ""){
            throw new ReservaInvalidaException("Debe introducir el destino");
        } else if (fecha.isBefore(LocalDate.now())) {
            throw new ReservaInvalidaException("La fecha debe ser posterior al día de hoy");
        } else if(numeroAsientos == 0){
            throw new ReservaInvalidaException("Debe indicar cuántos asientos desea reservar");
        }else {
            if (numeroAsientos > asientosTotales)
                throw new ReservaInvalidaException("No se pueden reservar tantos asientos. Solo quedan disponibles " + asientosTotales);
            else {
                this.nombre = nombre;
                this.destino = destino;
                this.fecha = fecha;
                this.numeroAsientos = numeroAsientos;
            }
        }
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                ", numeroAsientos=" + numeroAsientos +
                '}';
    }
}
