package com.miportfolio.agorosito.Repository;

import com.miportfolio.agorosito.Entity.Hys;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHys extends JpaRepository<Hys, Integer> {
    public Optional<Hys> findByNombreHys(String nombreHys);
    public boolean existsByNombreHys(String nombreHys);
}
