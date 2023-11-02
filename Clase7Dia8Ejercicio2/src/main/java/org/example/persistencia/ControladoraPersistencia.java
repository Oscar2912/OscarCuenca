package org.example.persistencia;

import org.example.logica.Platillos;

import java.util.List;

//Creación de las clases controladoras: para la lógica y para la persistencia.

public class ControladoraPersistencia {
    PlatillosJpaController platillosJpa = new PlatillosJpaController();

    public void crearPlatillos(Platillos platillos){
        platillosJpa.create(platillos);
    }

    public void eliminarPlatillos(int id){
        platillosJpa.destroy(id);
    }

    public void editarPlatillos(Platillos platillo){
        platillosJpa.edit(platillo);
    }

    public List<Platillos> listarPlatillos(){
        return platillosJpa.findPlatilloEntities();
    }
}
