package org.com.animal.Bird;


import org.com.animal.Animal;
import org.com.animal.CommonFunctions;

/*Bird class inheriting functionality from Animal and CommonFunction
Bird property
	walk
	cannot swim
	sing
	fly*/
public class Bird extends CommonFunctions implements Animal {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.print("I can walk");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.print("I cannot Swim");
	}
	
	
}
