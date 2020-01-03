package igf.g6.nacimientosservice.resources;

import igf.g6.nacimientosservice.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class nacimientoService {
    @Autowired
    private igf.g6.nacimientosservice.interfaces.nacimientoRepository nacimientoRepository;

    public List<Persona> getAllNacimientos(){
        List<Persona> nacimientos = new ArrayList<>();
        nacimientoRepository.findAll().forEach(nacimientos::add);
        return nacimientos;
    }

    public void addNacimiento(Persona nacimiento) {
        nacimientoRepository.save(nacimiento);
    }

    public Persona findByDui(String dui){
        return nacimientoRepository.findByDui(dui);
    }
}
