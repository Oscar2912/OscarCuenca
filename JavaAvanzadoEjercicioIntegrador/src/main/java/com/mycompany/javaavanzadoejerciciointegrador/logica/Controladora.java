package com.mycompany.javaavanzadoejerciciointegrador.logica;

import com.mycompany.javaavanzadoejerciciointegrador.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearEquipo(Equipo equipo){
        controlPersis.crearEquipo(equipo);
    }
    
    public List<Equipo> traerEquipos(){
        return controlPersis.traerEquipo();
    }
    
    public Equipo buscarEquipo(Long id){
        return controlPersis.buscarEquipo(id);
    }
    
    public void crearPartido(Partido partido, Long id1, Long id2){
        Equipo equipo1 = controlPersis.buscarEquipo(id1);
        Equipo equipo2 = controlPersis.buscarEquipo(id2);

        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        
        controlPersis.crearPartido(partido);
    }
    
    public List<Partido> traerPartidos(){
        return controlPersis.traerPartido();
    }
}
