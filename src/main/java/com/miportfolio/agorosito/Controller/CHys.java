package com.miportfolio.agorosito.Controller;

import com.miportfolio.agorosito.Dto.dtoHys;
import com.miportfolio.agorosito.Entity.Hys;
import com.miportfolio.agorosito.Security.Controller.Mensaje;
import com.miportfolio.agorosito.Service.SHys;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
@CrossOrigin(origins = "https://frontendagorosito.web.app")

public class CHys {
    
    @Autowired
    SHys sHabilidades;

    @GetMapping("/lista")
    public ResponseEntity<List<Hys>> list() {
        List<Hys> list = sHabilidades.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Hys> getById(@PathVariable("id") int id) {
        if (!sHabilidades.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Hys habilidades = sHabilidades.getOne(id).get();
        return new ResponseEntity(habilidades, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sHabilidades.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sHabilidades.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHys dtohabilidades) {
        if (StringUtils.isBlank(dtohabilidades.getNombreH())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sHabilidades.existsByNombreH(dtohabilidades.getNombreH())) {
            return new ResponseEntity(new Mensaje("Esa habilidad existe"), HttpStatus.BAD_REQUEST);
        }

        Hys habilidades = new Hys(dtohabilidades.getNombreH(), dtohabilidades.getPorcentajeH(), dtohabilidades.getImagenH());
        sHabilidades.save(habilidades);
        return new ResponseEntity(new Mensaje("habilidad agregada"), HttpStatus.OK);
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHys dtohabilidades) {
        //validamos ID
        if (!sHabilidades.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        }
        //compara nombres de experiencias
        if (sHabilidades.existsByNombreH(dtohabilidades.getNombreH()) && sHabilidades.getByNombreH(dtohabilidades.getNombreH()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Habilidad existente"), HttpStatus.BAD_REQUEST);
        }
        // no puede estar vacio
        if (StringUtils.isBlank(dtohabilidades.getNombreH())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Hys habilidades = sHabilidades.getOne(id).get();
        habilidades.setNombreH(dtohabilidades.getNombreH());
        habilidades.setImagenH(dtohabilidades.getImagenH());
        habilidades.setPorcentajeH(dtohabilidades.getPorcentajeH());

        sHabilidades.save(habilidades);
        return new ResponseEntity(new Mensaje("Habilidad Actualizada"), HttpStatus.OK);
    }
}
