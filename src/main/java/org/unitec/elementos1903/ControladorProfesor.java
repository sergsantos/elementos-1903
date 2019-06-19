package org.unitec.elementos1903;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    @GetMapping("/profesor")
    public List<Profesor> buscarTodos(){
    return repoProfe.findAll();
    }
    //Borrar
    @DeleteMapping("/profesor/{id}")
    public Estatus borrar(@PathVariable Integer id){
    repoProfe.deleteById(id);
    Estatus e =new Estatus();
    e.setSuccess(true);
    e.setMensaje("Profesor borrado con exito");
    return e;
    }
    //Actualizar
    @PutMapping("/Profesor")
    public Estatus actualizar(@RequestBody String json)throws Exception{
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
    //Buscar por Id
    @GetMapping("/profesor/{id}")
    public Profesor buscarPorId(@PathVariable Integer id){
    return repoProfe.findById(id).get();
    }
}
