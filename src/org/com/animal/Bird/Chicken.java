package org.com.animal.Bird;


/*Chicken interited the properties of bird with diff sound and cannot swim
Chicken property
walk
cannot swim
Cluck, cluck
fly*/

public class Chicken extends Bird {

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
