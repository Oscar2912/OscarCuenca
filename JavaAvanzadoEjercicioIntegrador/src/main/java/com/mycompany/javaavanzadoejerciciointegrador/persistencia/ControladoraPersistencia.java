package com.mycompany.javaavanzadoejerciciointegrador.persistencia;

import com.mycompany.javaavanzadoejerciciointegrador.logica.Equipo;
import com.mycompany.javaavanzadoejerciciointegrador.logica.Partido;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    EquipoJpaController equipoJPA = new EquipoJpaController();
    PartidoJpaController partidoJPA = new PartidoJpaController();

    public void crearEquipo (Equipo equipo){
        equipoJPA.create(equipo);
    }
    
    public List<Equipo> traerEquipo(){
        return equipoJPA.findEquipoEntities();
    }
    
    public Equipo buscarEquipo(Long id){
        List<Equipo> listaEquipos = new ArrayList<>(equipoJPA.findEquipoEntities());
        Equipo equipoFiltrado = new Equipo();
        for(Equipo equipos : listaEquipos){
            if(equipos.getId() == id)
                equipoFiltrado = equipos;
        }
        return equipoFiltrado;
    }
    
    public void crearPartido (Partido partido){
        partidoJPA.create(partido);
    }
    
    public List<Partido> traerPartido(){
        return partidoJPA.findPartidoEntities();
    }
}
