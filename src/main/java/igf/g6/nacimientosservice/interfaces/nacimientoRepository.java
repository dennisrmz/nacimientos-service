package igf.g6.nacimientosservice.interfaces;

import igf.g6.nacimientosservice.models.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface nacimientoRepository extends CrudRepository<Persona, Long> {
    public Persona findByDui(String dui);
}
