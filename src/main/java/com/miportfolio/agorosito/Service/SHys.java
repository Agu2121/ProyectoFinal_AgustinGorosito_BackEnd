package com.miportfolio.agorosito.Service;

import com.miportfolio.agorosito.Entity.Hys;
import com.miportfolio.agorosito.Repository.RHys;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHys {

@Autowired
    RHys rHabilidades;

    public List<Hys> list() {
        return rHabilidades.findAll();
    }

    public Optional<Hys> getOne(int id) {
        return rHabilidades.findById(id);
    }

    public Optional<Hys> getByNombreH(String nombreH) {
        return rHabilidades.findByNombreH(nombreH);
    }

    public void save(Hys Habilidad) {
        rHabilidades.save(Habilidad);
    }

    public void delete(int id) {
        rHabilidades.deleteById(id);
    }

    public boolean existsById(int id) {
        return rHabilidades.existsById(id);
    }

    public boolean existsByNombreH(String nombreH) {
        return rHabilidades.existsByNombreH(nombreH);
    }
}
