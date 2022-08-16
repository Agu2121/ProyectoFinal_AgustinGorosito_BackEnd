package com.miportfolio.agorosito.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private int fechaInicioE;
    private int fechaFinE;
    private String imgE;
    
    //Constructores

    public Educacion() {
    }

    public Educacion(String nombreE, String descripcionE, int fechaInicioE, int fechaFinE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaInicioE = fechaInicioE;
        this.fechaFinE = fechaFinE;
        this.imgE = imgE;
    }
    
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public int getFechaInicioE() {
        return fechaInicioE;
    }

    public void setFechaInicioE(int fechaInicioE) {
        this.fechaInicioE = fechaInicioE;
    }

    public int getFechaFinE() {
        return fechaFinE;
    }

    public void setFechaFinE(int fechaFinE) {
        this.fechaFinE = fechaFinE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }

    
    
}
