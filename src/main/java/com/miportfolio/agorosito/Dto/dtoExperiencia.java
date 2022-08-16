package com.miportfolio.agorosito.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private int fechaInicioE;
    @NotBlank
    private int fechaFinE;
    @NotBlank
    private String imgE;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, int fechaInicioE, int fechaFinE, String imgE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaInicioE = fechaInicioE;
        this.fechaFinE = fechaFinE;
        this.imgE = imgE;
    }

    //Getters and Setters

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
