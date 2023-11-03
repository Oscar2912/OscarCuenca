package org.example;

import org.example.logica.Platillos;
import org.example.persistencia.ControladoraPersistencia;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ControladoraPersistencia controladora = new ControladoraPersistencia();

        //Crear un nuevo objeto platillo y darlo de alta en la base de datos mediante JPA.
        Platillos platillo1 = new Platillos(1, "Ensalada", "Simple", 6.99);

        //Crear 2 objetos de tipo platillo más. Eliminar luego uno y editar los datos de otro mediante JPA.
        Platillos platillo2 = new Platillos(2, "Pollo Asado", "Elaborada", 14.99);
        Platillos platillo3 = new Platillos(3, "Sopa", "Simple", 5.99);


        //Persisto (ALTA) el objeto mediante JPA
        System.out.println("Creando los platillos indicados...");
        controladora.crearPlatillos(platillo1);
        controladora.crearPlatillos(platillo2);
        controladora.crearPlatillos(platillo3);

        //Elimino (BAJA) un registro creado y persistido anteriormente
        System.out.println("Eliminando el segundo platillo...");
        controladora.eliminarPlatillos(2);

        //Editar (MODIFICACIÓN) un registro que ya existe
        platillo3.setPrecio(4.99);
        controladora.editarPlatillos(platillo3);

        //Obtener de la base de datos los platillos restantes en la base de datos y mostrarlos por pantalla.
        System.out.println("**** LISTADO DE LOS PLATILLOS DISPONIBLES ****");
        List<Platillos> listPlatillos = controladora.listarPlatillos();
        for(Platillos platillos : listPlatillos){
            System.out.println("Id: " + platillos.getId() +
                    "\nNombre: " + platillos.getNombre() +
                    "\nReceta: " + platillos.getReceta() +
                    "\nPrecio: " + platillos.getPrecio() + "\n");
        }
    }
}