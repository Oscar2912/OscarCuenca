import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Eventos> eventos = Arrays.asList(
                new Eventos("Reunión dirección", LocalDate.of(2023,11,20), "Reunión"),
                new Eventos("Reunión soporte", LocalDate.of(2023,11,16), "Reunión"),
                new Eventos("Peluquería", LocalDate.of(2023,11,14), "Evento"),
                new Eventos("Cena familiar", LocalDate.of(2023,11,18), "Evento"),
                new Eventos("Reparación coche", LocalDate.of(2022,11,21), "Taller")
        );


        //Filtra los eventos que están programados para una fecha específica.
        System.out.println("**** EVENTOS PROGRAMADOS PARA EL 18/11/2023 ****");
        eventos.stream()
                .filter(e -> Objects.equals(e.getFecha(), LocalDate.of(2023, 11, 18)))
                .forEach(System.out::println);

        //Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
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
        Optional<Eventos> primerEvento = eventos.stream()
                .min(Comparator.comparing(Eventos::getFecha));

        if(primerEvento.isPresent())
            System.out.println("El primer evento registrado es: \n" + primerEvento.get());
        else
            System.out.println("No se ha encontrado cuál es el primer evento.");


    }
}