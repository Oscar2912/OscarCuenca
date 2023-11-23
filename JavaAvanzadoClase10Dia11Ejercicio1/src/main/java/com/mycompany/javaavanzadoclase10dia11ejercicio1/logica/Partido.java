package com.mycompany.javaavanzadoclase10dia11ejercicio1.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Atributos
@Entity
public class Partido implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private Integer votos = 0;

    //Constructores
    public Partido() {
    }

    public Partido(String nombre, Integer votos) {
        this.nombre = nombre;
        this.votos = votos;
    }

    //Metodos
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }
    
    
}
