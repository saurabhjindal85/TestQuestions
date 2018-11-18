package org.com.animal.fish;

import org.com.animal.Animal;
import org.com.animal.CommonFunctions;

/*
Model Fish Class
 dont sing
 dont walk
 dont fly
 can swim*/

public abstract class Fish extends CommonFunctions implements Animal{

	@Override
	public void walk() {
		System.out.println("Fish dont walk");
	}

	@Override
	public void fly() {
		System.out.println("Fish dont fly");
	}

	@Override
	public void sing() {
		System.out.println("fish dont sing");
	}

	abstract void appearance();
	
}
