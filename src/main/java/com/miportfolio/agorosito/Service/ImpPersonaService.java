package com.miportfolio.agorosito.Service;

import com.miportfolio.agorosito.Entity.Persona;
import com.miportfolio.agorosito.Interface.IPersonaService;
import com.miportfolio.agorosito.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository ipersonaRepository;

    //Traer lista de personas
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    //Guardar persona
    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    //Eliminar persona
    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
}
