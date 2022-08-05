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
    RHys rHys;

    public List<Hys> list() {
        return rHys.findAll();
    }

    public Optional<Hys> getOne(int id) {
        return rHys.findById(id);
    }

    public Optional<Hys> getByNombreHys(String nombreHys) {
        return rHys.findByNombreHys(nombreHys);
    }

    public void save(Hys hys) {
        rHys.save(hys);
    }

    public void delete(int id) {
        rHys.deleteById(id);
    }

    public boolean existsById(int id) {
        return rHys.existsById(id);
    }

    public boolean existsByNombreHys(String nombreHys) {
        return rHys.existsByNombreHys(nombreHys);
    }
}
