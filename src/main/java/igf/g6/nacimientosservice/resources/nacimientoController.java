package igf.g6.nacimientosservice.resources;


import igf.g6.nacimientosservice.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class nacimientoController {

    @Autowired
    private nacimientoService nacimientoService;

    @RequestMapping("/nacimientos")
    public List<Persona> getAllNacimiento(){
        return nacimientoService.getAllNacimientos();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/nacimientos")
    public void addNacimiento(@RequestBody Persona nacimiento){
        nacimientoService.addNacimiento(nacimiento);
    }

    @RequestMapping("/nacimientos/{dui}")
    public Persona findByDui(@PathVariable String dui){
        return nacimientoService.findByDui(dui);
    }
}
