package org.unitec.elementos1903;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
IOC dependency inyection:
Cliente-RepoCLiente-MongoRepository
Save
findbyId
find all
delete
*/
@SpringBootApplication
public class Elementos1903Application implements CommandLineRunner{ 
    @Autowired 
    RepoCliente repoCliente;

	public static void main(String[] args) {
		SpringApplication.run(Elementos1903Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
     for(Cliente c: repoCliente.findByEmail("rapidclimate@gmail.com")){
         System.out.println(c);
     }
        
   //repoCliente.save(new Cliente(1,"Quenns","rapidclimate@gmail.com"));
   //repoCliente.save(new Cliente(2,"Quenns","rapidclimate@gmail.com"));
        System.out.println(repoCliente.findById(2));
    }

}
