public class Main {
    public static void main(String[] args) {
        //Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.

        //a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.

        Electrodomesticos lavadora1 = new Electrodomesticos("001", "Siemens", "01VFL", "D", "Blanco");
        Electrodomesticos lavadora2 = new Electrodomesticos("002", "Philips", "08PJK", "C", "Gris");
        Electrodomesticos lavadora3 = new Electrodomesticos("003", "Sony", "12SVM", "A", "Negro");

        //b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
        Electrodomesticos frigorifico1 = new Electrodomesticos();

        //c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
        System.out.println("***** Lavadora 1 *****");
        System.out.println(lavadora1.getMarca());
        System.out.println(lavadora1.getModelo());
        System.out.println(lavadora1.getConsumo());
        System.out.println("***** Lavadora 2 *****");
        System.out.println(lavadora2.getMarca());
        System.out.println(lavadora2.getModelo());
        System.out.println(lavadora2.getConsumo());
        System.out.println("***** Lavadora 3 *****");
        System.out.println(lavadora3.getMarca());
        System.out.println(lavadora3.getModelo());
        System.out.println(lavadora3.getConsumo());

        //d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
        System.out.println("***** Frigorífico 1 *****");
        System.out.println(frigorifico1.getMarca());

    }
}