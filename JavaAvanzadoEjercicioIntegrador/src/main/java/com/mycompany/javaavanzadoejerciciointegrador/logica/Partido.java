package com.mycompany.javaavanzadoejerciciointegrador.logica;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Partido implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer puntosEquipo1;
    private Integer puntosEquipo2;
    private LocalDate fecha;
    
    @ManyToOne
    @JoinColumn(name = "equipo1_id")
    private Equipo equipo1;
    
    @ManyToOne
    @JoinColumn(name = "equipo2_id")
    private Equipo equipo2;

    public Partido() {
    }

    public Partido(Long id, Equipo equipo1, Integer puntosEquipo1, Equipo equipo2, Integer puntosEquipo2, LocalDate fecha) {
        this.id = id;
        this.equipo1 = equipo1;
        this.puntosEquipo1 = puntosEquipo1;
        this.equipo2 = equipo2;
        this.puntosEquipo2 = puntosEquipo2;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Integer getPuntosEquipo1() {
        return puntosEquipo1;
    }

    public void setPuntosEquipo1(Integer puntosEquipo1) {
        this.puntosEquipo1 = puntosEquipo1;
    }
    
    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public Integer getPuntosEquipo2() {
        return puntosEquipo2;
    }

    public void setPuntosEquipo2(Integer puntosEquipo2) {
        this.puntosEquipo2 = puntosEquipo2;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
}
