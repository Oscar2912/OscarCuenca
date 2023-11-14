import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Se crea la lista eventos y se almacenan varios objetos Empleados en ella
        List<Empleados> empleados = Arrays.asList(
            new Empleados("Julio", 1148.56, "Soporte"),
            new Empleados("Óscar", 1956.25, "Desarrollador"),
            new Empleados("Federico", 2687.26, "Gerente"),
            new Empleados("Sofía", 2065.35, "Desarrollador"),
            new Empleados("Sebastián", 1235.56, "Soporte")
        );

        //Filtra los empleados cuyo salario sea mayor a cierto valor específico.
        //Se filtran los objetos de la lista y se muestran aquellos que tengan un salario mayor al indicado en el filter
        System.out.println("**** EMPLEADOS CON UN SALARIO MAYOR A 2000 EUROS ****");

        empleados.stream()
                .filter(e -> e.getSalario() > 2000)
                .forEach(System.out::println);

        //Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        //Se filtran los objetos de la lista por categoría y se hace una media del salario de  aquellos objetos que tengan la misma categoría que la indicada en el filter
        //Por último, se muestra la media obtenida en cada categoría, y si no se obtiene ninguna media, se muestra un mensaje que lo especifica
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
        //Se crea un Optional en el que se almacenará el empleado con mayor salario
        //Se recorre el listado de empleados y se almacena el que tenga mayor cantidad en el campo salario
        Optional<Empleados> mejorPagado = empleados.stream()
                .max(Comparator.comparing(Empleados::getSalario));

        //Se muestra el objeto que se haya almacenado con la mayor cantidad en salario
        if(mejorPagado.isPresent())
            System.out.println("El empleado mejor pagado es: \n" + mejorPagado.get());
        else
            System.out.println("No se ha encontrado cuál es el empleado con mejor salario.");

    }
}