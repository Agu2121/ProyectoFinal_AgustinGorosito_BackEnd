package com.miportfolio.agorosito.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreHys;
    private String porcentajeHys;

    //Constructores
    public Hys() {
    }
    
    public Hys(String nombreHys, String porcentajeHys) {
        this.nombreHys = nombreHys;
        this.porcentajeHys = porcentajeHys;
    }

    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreHys() {
        return nombreHys;
    }

    public void setNombreHys(String nombreHys) {
        this.nombreHys = nombreHys;
    }

    public String getPorcentajeHys() {
        return porcentajeHys;
    }

    public void setPorcentajeHys(String porcentajeHys) {
        this.porcentajeHys = porcentajeHys;
    }
    
}