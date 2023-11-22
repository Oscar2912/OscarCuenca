package com.mycompany.javaavanzadoclase10dia11ejercicio1.logica;

public class Partido {
    private String nombre;
    private Integer votos;

    public Partido() {
    }

    public Partido(String nombre, Integer votos) {
        this.nombre = nombre;
        this.votos = votos;
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
