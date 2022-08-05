package com.miportfolio.agorosito.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHys {
    @NotBlank
    private String nombreHys;
    @NotBlank
    private String porcentajeHys;
    
    //Constructores

    public dtoHys() {
    }

    public dtoHys(String nombreHys, String porcentajeHys) {
        this.nombreHys = nombreHys;
        this.porcentajeHys = porcentajeHys;
    }
    
    //Getters and Setters

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
