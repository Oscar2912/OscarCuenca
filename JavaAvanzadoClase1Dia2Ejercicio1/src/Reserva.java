import java.time.LocalDate;

public class Reserva {
    private String nombre;
    private String destino;
    private LocalDate fecha;
    private int numeroAsientos;
    private int asientosTotales = 2000;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public int getAsientosTotales() {
        return asientosTotales;
    }

    public Reserva(String nombre, String destino, String fecha, int numeroAsientos) {
    }

    public Reserva(String nombre, String destino, LocalDate fecha, int numeroAsientos) throws ReservaInvalidaException{
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
