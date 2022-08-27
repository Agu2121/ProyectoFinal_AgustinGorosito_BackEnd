package com.miportfolio.agorosito.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud requerida")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud requerida")
    private String apellido;
    
    @Size(min = 1, max = 455, message = "No cumple con la longitud requerida")
    private String img;

    @Size(min = 1, max = 455, message = "No cumple con la longitud requerida")
    private String descripcion; 
    
    @Size(min = 1, max = 255, message = "No cumple con la longitud requerida")
    private String puesto;
    
    @Size(min = 1, max = 455, message = "No cumple con la longitud requerida")
    private String banner; 
}
