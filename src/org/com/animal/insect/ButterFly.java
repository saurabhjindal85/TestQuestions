package org.com.animal.insect;

import org.com.animal.Animal;
import org.com.animal.CommonFunctions;

/*Butterfly interited fly functionality from common fucntion
and override other property

a. A butterfly can fly
b. A butterfly does not make a sound

*/
public class ButterFly implements Insect{

	@Override
	public void walk() {
		System.out.println("Butterfly dont walk");
	}
	
	@Override
	public void fly() {
		System.out.println("Butterfly can fly");
	}


	@Override
	public void sing() {
		System.out.println("A butterfly does not make a sound");
	}
	
	

}
