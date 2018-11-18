
package org.com.animal.Bird;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/*Chicken interited the properties of bird with diff sound and cannot swim
Chicken property
walk
cannot swim
Cluck, cluck
fly*/

@Path("/Bird")
public class Chicken extends Bird {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/chicken")
	public String chickenRestService(){
		return "response from chicken webService";
	}
	
	@Override
	public void swim() {
		System.out.print("Chicken Cannot Swim");
	}
	
	@Override
	public void fly() {
		System.out.print("Chicken Cannot fly");
	}

	@Override
	public void  sing() {
		System.out.print("Cluck, cluck");
	}
}
