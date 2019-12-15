package igf.g6.nacimientosservice.resources;


import igf.g6.nacimientosservice.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
