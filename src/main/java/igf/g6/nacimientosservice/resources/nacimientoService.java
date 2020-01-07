package igf.g6.nacimientosservice.resources;

import igf.g6.nacimientosservice.interfaces.nacimientoRepository;
import igf.g6.nacimientosservice.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class nacimientoService {
    @Autowired
    private nacimientoRepository nacimientoRepository;

    //Mostrando Todos Los Nacimientos
    public List<Persona> getAllNacimientos(){
        List<Persona> nacimientos = new ArrayList<>();
        nacimientoRepository.findAll().forEach(nacimientos::add);
        return nacimientos;
    }

    //Mostrando Un Nacimiento Especifico
    public Persona getNacimiento(Long id) {
        return nacimientoRepository.findById(id).get();
    }

    //Mostrando Un Nacimiento Especifico por Primer Nombre
    public List<Persona> getNacimientoNombre(String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido) {
        List<Persona> nacimientos = new ArrayList<>();
        nacimientoRepository.findAll().forEach(nacimientos::add);
        List<Persona> personaEncontrada = new ArrayList<>();

        for (int i = 0; i < nacimientos.size() ; i++) {
            if (primer_nombre.equals(nacimientos.get(i).getPrimer_nombre()) && segundo_nombre.equals(nacimientos.get(i).getSegundo_nombre() )
                    && primer_apellido.equals(nacimientos.get(i).getPrimer_apellido()) && segundo_apellido.equals(nacimientos.get(i).getSegundo_apellido()) ) {
                personaEncontrada.add(nacimientos.get(i));
            }
        }
        return personaEncontrada;
    }

    //Agregando Un Nacimiento
    public void addNacimiento(Persona nacimiento) {
        nacimientoRepository.save(nacimiento);
    }

    //Actualizando un Nacimiento
    public void updateNacimiento(Long id, Persona nacimiento){
        nacimientoRepository.save(nacimiento);
    }

    /*
    Eliminando Un Nacimiento
    public void deleteNacimiento(Long id){
    topicRepository.delete(id);
    }
     */
}
