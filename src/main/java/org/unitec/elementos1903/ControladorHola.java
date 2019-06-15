
package org.unitec.elementos1903;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Servicios Especiales
 */
@RestController
@RequestMapping("/api")
public class ControladorHola {
    @GetMapping("/hola")
    public String hola(){
    return"Servidor WEB Sergio Santos :";
    }
}
//Generar repositorio de github "elementos-1903" 
