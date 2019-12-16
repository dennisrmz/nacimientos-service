package igf.g6.nacimientosservice.resources;


import igf.g6.nacimientosservice.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class nacimientoController {

    @Autowired
    private nacimientoService nacimientoService;

    //Ruta y Metodo Para Obtener Todos Los Nacimientos
    @RequestMapping("/nacimientos")
    public List<Persona> getAllNacimiento(){
        return nacimientoService.getAllNacimientos();
    }

    //Ruta y Metodo Para Obtener Un Nacimientos
    @RequestMapping("/nacimientos/{id}")
    public Persona getNacimiento(@PathVariable Long id){
        return nacimientoService.getNacimiento(id);
    }

    //Ruta y Metodo Para Obtener Agregar un Nacimientos
    @RequestMapping(method = RequestMethod.POST, value = "/nacimientos")
    public void addNacimiento(@RequestBody Persona nacimiento){
        nacimientoService.addNacimiento(nacimiento);
    }

    //Ruta y Metodo Para Actualizar Un Nacimientos
    @RequestMapping(method = RequestMethod.PUT, value = "/nacimientos/{id}")
    public void updateNacimiento(@RequestBody Persona nacimiento, @PathVariable Long id){
        nacimientoService.updateNacimiento(id, nacimiento);
    }


    /*
    Ruta y Metodo Para Eliminar Un Nacimientos

    @RequestMapping(method = RequestMethod.DELETE, value = "/nacimientos/{id}")
    public void deleteNacimiento(@PathVariable Long id){
        nacimientoService.deleteNacimiento(id);
    }
    */

}
