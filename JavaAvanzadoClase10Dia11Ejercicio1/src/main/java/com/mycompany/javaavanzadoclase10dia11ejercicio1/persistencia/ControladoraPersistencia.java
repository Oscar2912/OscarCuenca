package com.mycompany.javaavanzadoclase10dia11ejercicio1.persistencia;

import com.mycompany.javaavanzadoclase10dia11ejercicio1.logica.Partido;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    PartidoJpaController controladoraJPA = new PartidoJpaController();
    
    public void crearPartido(Partido partido){
        controladoraJPA.create(partido);
    }
    
    public List<Partido> traerPartidos(){
        return controladoraJPA.findPartidoEntities();
    }
    
    public Partido buscarPartido(Long id){
        return controladoraJPA.findPartido(id);
    }
    
    public void modificarPartido(Partido partido){
        try{
            controladoraJPA.edit(partido);
        }catch (Exception e){
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
