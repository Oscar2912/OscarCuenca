package org.example.logica;

import javax.persistence.*;

//Mapeo mediante annotations
@Entity //Indica a JPA que es una clase de entidad
@Table(name="platillos") //Es una buena práctica indicar que esta clase será la tabla platillos
public class Platillos {
    //Atributos
    @Id //Determina cuál será la PK de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Determina que el atributo sea auto incremental
    private int id;
    private String nombre;
    private String receta;
    private double precio;

    //Contructores
    public Platillos() {
    }

    public Platillos(int id, String nombre, String receta, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.receta = receta;
        this.precio = precio;
    }

    //Métodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}