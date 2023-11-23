package com.mycompany.javaavanzadoclase10dia11ejercicio1.logica;

import com.mycompany.javaavanzadoclase10dia11ejercicio1.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controladora = new ControladoraPersistencia();
    
    //Se comprueba si la tabla de la BD está vacía, y si lo está, se crean los 3 partidos con 0 votos cada uno
    public void crearPartido(){
        if(controladora.traerPartidos().isEmpty()){
            List<Partido> listaPartidos = new ArrayList<>();
        
            listaPartidos.add(new Partido("Partido A", 0));
            listaPartidos.add(new Partido("Partido B", 0));
            listaPartidos.add(new Partido("Partido C", 0));

            for(Partido partidos : listaPartidos){
                controladora.crearPartido(partidos);
            }
        }
    }
    
    //Se almacena la información de la BD en una lista
    public List<Partido> traerPartidos(){
        return (List<Partido>) controladora.traerPartidos();
    }
    
    //Se busca el partido por el Id indicado en el parámetro que se para al llamar al método
    public Partido buscarPartido(Long id){
        return (Partido) controladora.buscarPartido(id);
    }
    
    //Se modifica el partido de la BD, poniendo los datos que se encuentran en el partido que se pasa por parámetro al llamar al método
    public void modificarPartido(Partido partido){
        controladora.modificarPartido(partido);
    }
}
