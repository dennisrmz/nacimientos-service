package igf.g6.nacimientosservice.interfaces;

import igf.g6.nacimientosservice.models.Persona;
import org.springframework.data.repository.CrudRepository;

public interface nacimientoRepository extends CrudRepository<Persona, Long> {
}
