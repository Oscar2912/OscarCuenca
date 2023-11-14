import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Se crea la lista eventos y se almacenan varios objetos Eventos en ella
        List<Eventos> eventos = Arrays.asList(
                new Eventos("Reunión dirección", LocalDate.of(2020,11,20), "Reunión"),
                new Eventos("Reunión soporte", LocalDate.of(2023,11,18), "Reunión"),
                new Eventos("Peluquería", LocalDate.of(2023,11,14), "Evento"),
                new Eventos("Cena familiar", LocalDate.of(2023,11,14), "Evento"),
                new Eventos("Reparación coche", LocalDate.of(2023,11,18), "Taller")
        );


        //Filtra los eventos que están programados para una fecha específica.
        //Se filtran los objetos de la lista y se muestran aquellos que tengan la misma fecha que la indicada en el filter
        System.out.println("**** EVENTOS PROGRAMADOS PARA EL 18/11/2023 ****");
        eventos.stream()
                .filter(e -> Objects.equals(e.getFecha(), LocalDate.of(2023, 11, 18)))
                .forEach(System.out::println);

        //Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        //Se crean 3 listas, una para cada categoría, y se almacenan en cada una aquellos objetos que tengan la misma que la indicada en el filter
        //Por último, se muestra cuántos objetos existen en cada lista
        System.out.println("**** EVENTOS DE CADA CATEGORÍA ****");
        List<Eventos> reunionesProgramadas = eventos.stream()
                .filter(e -> e.getCategoria().equalsIgnoreCase("reunión"))
                .toList();
        System.out.println("Existen " + (long) reunionesProgramadas.size() + " reuniones actualmente.");

        List<Eventos> eventosProgramados = eventos.stream()
                .filter(e -> e.getCategoria().equalsIgnoreCase("evento"))
                .toList();
        System.out.println("Existen " + (long) eventosProgramados.size() + " eventos actualmente.");

        List<Eventos> talleresProgramados = eventos.stream()
                .filter(e -> e.getCategoria().equalsIgnoreCase("taller"))
                .toList();
        System.out.println("Existen " + (long) talleresProgramados.size() + " citas en talleres actualmente.");

        //Encuentra el evento más próximo en el tiempo utilizando Optionals.
        //Se crea un Optional en el que se almacenará el evento más próximo a la fecha de hoy
        //Se recorre el listado de eventos, filtrándolos por el atributo fecha, y comparandolos con la fecha de hoy
        //Se indica que el filtro no actúa sobre eventos anteriores al día de hoy, y que tras descartar los eventos pasados, almacene el que tenga menor diferencia de días con la fecha de hoy
        Optional<Eventos> proximoEvento = eventos.stream()
                .filter(e -> !LocalDate.now().isAfter(e.getFecha()))
                .min(Comparator.comparing(e -> ChronoUnit.DAYS.between(LocalDate.now(),e.getFecha())));

        //Se muestra el objeto que se haya almacenado con la menor diferencia de días con la fecha actual, y si no existiese, se muestra un mensaje
        if(proximoEvento.isPresent())
            System.out.println("El evento más próximo es: \n" + proximoEvento.get());
        else
            System.out.println("No se ha encontrado cuál es el evento más próximo al día de hoy.");


    }
}