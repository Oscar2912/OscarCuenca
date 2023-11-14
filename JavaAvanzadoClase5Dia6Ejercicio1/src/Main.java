import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Empleados> empleados = Arrays.asList(
            new Empleados("Julio", 1148.56, "Soporte"),
            new Empleados("Óscar", 1956.25, "Desarrollador"),
            new Empleados("Federico", 2687.26, "Gerente"),
            new Empleados("Sofía", 2065.35, "Desarrollador"),
            new Empleados("Sebastián", 1235.56, "Soporte")
        );

        //Filtra los empleados cuyo salario sea mayor a cierto valor específico.
        System.out.println("**** EMPLEADOS CON UN SALARIO MAYOR A 2000 EUROS ****");

        empleados.stream()
                .filter(e -> e.getSalario() > 2000)
                .forEach(System.out::println);

        //Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        System.out.println("**** SALARIO PROMEDIO POR CATEGORÍA ****");

        empleados.stream()
                    .filter(e -> e.getCategoria().equalsIgnoreCase("soporte"))
                    .mapToDouble(Empleados::getSalario)
                    .average()
                    .ifPresentOrElse(value -> System.out.println("El salario promedio de soporte es: " + value),
                            () -> System.out.println("No se han encontrado datos sobre el salario en soporte"));

        empleados.stream()
                .filter(e -> e.getCategoria().equalsIgnoreCase("desarrollador"))
                .mapToDouble(Empleados::getSalario)
                .average()
                .ifPresentOrElse(value -> System.out.println("El salario promedio de los desarrolladores es: " + value),
                        () -> System.out.println("No se han encontrado datos sobre el salario en desarrollo"));

        empleados.stream()
                .filter(e -> e.getCategoria().equalsIgnoreCase("gerente"))
                .mapToDouble(Empleados::getSalario)
                .average()
                .ifPresentOrElse(value -> System.out.println("El salario promedio de los gerentes es: " + value),
                        () -> System.out.println("No se han encontrado datos sobre el salario de los gerentes"));

        //Encuentra al empleado con el salario más alto utilizando Optionals.
        Optional<Empleados> mejorPagado = empleados.stream()
                .max(Comparator.comparing(Empleados::getSalario));

        if(mejorPagado.isPresent())
            System.out.println("El empleado mejor pagado es: \n" + mejorPagado.get());
        else
            System.out.println("No se ha encontrado cuál es el empleado con mejor salario.");

    }
}