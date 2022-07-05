package com.miportfolio.agorosito.Interface;

import com.miportfolio.agorosito.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();
    
    //Guardar objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar objeto buscandolo por Id
    public void deletePersona(Long id);
    
    //Buscar persona por su Id
    public Persona findPersona(Long id);
}
