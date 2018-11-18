package org.com.animal.restservice;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.com.animal.Bird.Duck;

/*Based on the PathParam we can fetch the direct animal object and perform the required operation */


@Path("/animal")
public class RestService {

	@GET
	@Path("/{animalSpecies}")
	@Produces(MediaType.TEXT_PLAIN)
	public String animalRestService(@PathParam("animalSpecies") String animalSpecies){
		if("duck".equalsIgnoreCase(animalSpecies)){
			//Duck duck = new Duck();
			return "Duck Service called can implement any functionality";
		}else if("chicken".equalsIgnoreCase(animalSpecies)){
			
			return "Chicken Service called can implement any functionality";
		}else if("Parrot".equalsIgnoreCase(animalSpecies)){
			
			return "PArrot Service called can implement any functionality";
		}
		else{
			return "not an animal in list";
		}
	}
}





