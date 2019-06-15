package org.unitec.elementos1903;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Servicios Especiales
 */
@RestController
@RequestMapping("/api")
public class ControladorProfesor {
  //Metodo para guardar :
    @Autowired 
    RepoProfesor repoProfe;
    @PostMapping("/profesor")
    public Estatus guardar (@RequestBody String json) throws Exception{
        //Recibir Json del cliente WEB y lo transformamos a objeto JAVA 
        //con la clase object maped
        ObjectMapper maper=new ObjectMapper();
        //Ahora si lo leemos
        Profesor profe= maper.readValue(json, Profesor.class);
        repoProfe.save(profe);
        Estatus e=new Estatus();
        e.setMensaje("Profe guardado con exito");
        e.setSuccess(true);
        return e;
   }
    @GetMapping("/profesor");
    public List<Profesor> buscarTodos(){
    return repoProfe.findAll();
    }
}
